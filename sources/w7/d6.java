package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.kb0;
public abstract class d6 {
    public static boolean a(kb0 kb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(kb0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && kb0Var == kb0.h)) {
            return true;
        }
        return false;
    }

    public static void b(kb0 kb0Var) {
        kb0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (kb0 kb0Var2 : kb0.values()) {
            ComponentName a2 = kb0Var2.a(context);
            if (kb0Var2 == kb0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
