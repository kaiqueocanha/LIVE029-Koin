package com.example.livekoin

import android.app.Application
import com.example.livekoin.di.appModules
import com.example.livekoin.di.modules.apiModule
import com.example.livekoin.di.modules.repositoriesModule
import com.example.livekoin.di.modules.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@AppApplication)
            modules(appModules)
        }

    }
}