package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.oa0;
public abstract class g6 {
    public static boolean a(oa0 oa0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(oa0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && oa0Var == oa0.h)) {
            return true;
        }
        return false;
    }

    public static void b(oa0 oa0Var) {
        oa0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (oa0 oa0Var2 : oa0.values()) {
            ComponentName a2 = oa0Var2.a(context);
            if (oa0Var2 == oa0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
