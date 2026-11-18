package org.telegram.utils.twidget;

import android.app.ZygotePreload;
import android.content.pm.ApplicationInfo;
import android.util.Log;
public final class WidgetEnginePreload implements ZygotePreload {
    public void doPreload(ApplicationInfo applicationInfo) {
        try {
            WidgetEngineService.c(applicationInfo.sourceDir);
        } catch (Throwable th2) {
            Log.e("WidgetEngine", "app zygote preload failed", th2);
        }
    }
}
