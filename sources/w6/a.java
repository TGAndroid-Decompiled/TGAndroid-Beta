package w6;

import android.app.RemoteInput;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.webkit.WebView;
public abstract class a {
    public static Context f43554a;
    public static Boolean f43555b;

    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static synchronized boolean b(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f43554a;
            if (context2 != null && (bool = f43555b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f43555b = null;
            if (u6.b.d()) {
                f43555b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f43555b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f43555b = Boolean.FALSE;
                }
            }
            f43554a = applicationContext;
            return f43555b.booleanValue();
        }
    }

    public static void c(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void d(MenuItem menuItem, char c10, int i10) {
        menuItem.setAlphabeticShortcut(c10, i10);
    }

    public static void e(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void f(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void g(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void h(MenuItem menuItem, char c10, int i10) {
        menuItem.setNumericShortcut(c10, i10);
    }

    public static void i(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
