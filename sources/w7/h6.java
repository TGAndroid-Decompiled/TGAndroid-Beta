package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ob0;
public abstract class h6 {
    public static boolean a(ob0 ob0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ob0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ob0Var == ob0.h)) {
            return true;
        }
        return false;
    }

    public static void b(ob0 ob0Var) {
        ob0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (ob0 ob0Var2 : ob0.values()) {
            ComponentName a2 = ob0Var2.a(context);
            if (ob0Var2 == ob0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
