package y6;

import android.app.RemoteInput;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
public abstract class a {
    public static Context f59035a;
    public static Boolean f59036b;

    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static float b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static synchronized boolean d(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f59035a;
            if (context2 != null && (bool = f59036b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f59036b = null;
            if (w6.b.d()) {
                f59036b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f59036b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f59036b = Boolean.FALSE;
                }
            }
            f59035a = applicationContext;
            return f59036b.booleanValue();
        }
    }

    public static boolean e(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void f(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }
}
