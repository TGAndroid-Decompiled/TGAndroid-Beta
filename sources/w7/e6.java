package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.lb0;
public abstract class e6 {
    public static boolean a(lb0 lb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(lb0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && lb0Var == lb0.h)) {
            return true;
        }
        return false;
    }

    public static void b(lb0 lb0Var) {
        lb0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (lb0 lb0Var2 : lb0.values()) {
            ComponentName a2 = lb0Var2.a(context);
            if (lb0Var2 == lb0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
