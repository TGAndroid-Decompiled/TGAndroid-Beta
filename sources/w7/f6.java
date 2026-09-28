package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.fb0;
public abstract class f6 {
    public static boolean a(fb0 fb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(fb0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && fb0Var == fb0.h)) {
            return true;
        }
        return false;
    }

    public static void b(fb0 fb0Var) {
        fb0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (fb0 fb0Var2 : fb0.values()) {
            ComponentName a2 = fb0Var2.a(context);
            if (fb0Var2 == fb0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
