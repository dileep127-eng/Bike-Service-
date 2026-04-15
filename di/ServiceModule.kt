package com.bikeservice.di

import android.content.Context
import com.bikeservice.service.GoogleDriveService
import com.bikeservice.service.ExcelExportService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Singleton
    @Provides
    fun provideGoogleDriveService(
        @ApplicationContext context: Context
    ): GoogleDriveService {
        return GoogleDriveService(context)
    }

    @Singleton
    @Provides
    fun provideExcelExportService(
        @ApplicationContext context: Context
    ): ExcelExportService {
        return ExcelExportService(context)
    }
}