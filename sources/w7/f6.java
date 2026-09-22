package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.nb0;
public abstract class f6 {
    public static boolean a(nb0 nb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(nb0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && nb0Var == nb0.h)) {
            return true;
        }
        return false;
    }

    public static void b(nb0 nb0Var) {
        nb0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (nb0 nb0Var2 : nb0.values()) {
            ComponentName a2 = nb0Var2.a(context);
            if (nb0Var2 == nb0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
