package dev.vadzimv.bigpicture

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.Registry
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.module.AppGlideModule
import okhttp3.OkHttpClient
import java.io.InputStream

@GlideModule
internal class UiGlideModule : AppGlideModule() {

    override fun registerComponents(context: Context, glide: Glide, registry: Registry) {
        val okHttpClient = getOkHttpClient()
        val okHttpUrlLoaderFactory = OkHttpUrlLoader.Factory(okHttpClient)

        glide.registry.replace(
            GlideUrl::class.java,
            InputStream::class.java,
            okHttpUrlLoaderFactory
        )
    }

    private fun getOkHttpClient() = OkHttpClient.Builder().build()

}