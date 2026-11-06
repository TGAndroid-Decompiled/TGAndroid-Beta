package z6;

import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
public abstract class a {
    public static Context f59611a;
    public static Boolean f59612b;

    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static PackageInfo b() {
        return WebView.getCurrentWebViewPackage();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static synchronized boolean e(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f59611a;
            if (context2 != null && (bool = f59612b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f59612b = null;
            if (x6.b.d()) {
                f59612b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f59612b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f59612b = Boolean.FALSE;
                }
            }
            f59611a = applicationContext;
            return f59612b.booleanValue();
        }
    }

    public static boolean f(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void g(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void h(Notification.Builder builder, int i7) {
        builder.setGroupAlertBehavior(i7);
    }

    public static void i(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void j(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }

    public static void k(Notification.Builder builder, long j3) {
        builder.setTimeoutAfter(j3);
    }
}
