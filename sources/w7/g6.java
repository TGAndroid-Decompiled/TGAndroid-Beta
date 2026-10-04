package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.jb0;
public abstract class g6 {
    public static boolean a(jb0 jb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(jb0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && jb0Var == jb0.h)) {
            return true;
        }
        return false;
    }

    public static void b(jb0 jb0Var) {
        jb0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (jb0 jb0Var2 : jb0.values()) {
            ComponentName a2 = jb0Var2.a(context);
            if (jb0Var2 == jb0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
