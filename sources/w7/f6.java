package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ib0;
public abstract class f6 {
    public static boolean a(ib0 ib0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ib0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ib0Var == ib0.h)) {
            return true;
        }
        return false;
    }

    public static void b(ib0 ib0Var) {
        ib0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (ib0 ib0Var2 : ib0.values()) {
            ComponentName a2 = ib0Var2.a(context);
            if (ib0Var2 == ib0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
