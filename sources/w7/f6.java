package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.mb0;
public abstract class f6 {
    public static boolean a(mb0 mb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(mb0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && mb0Var == mb0.h)) {
            return true;
        }
        return false;
    }

    public static void b(mb0 mb0Var) {
        mb0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (mb0 mb0Var2 : mb0.values()) {
            ComponentName a2 = mb0Var2.a(context);
            if (mb0Var2 == mb0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
