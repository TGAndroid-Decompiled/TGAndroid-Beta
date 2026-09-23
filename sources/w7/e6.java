package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.gb0;
public abstract class e6 {
    public static boolean a(gb0 gb0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(gb0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && gb0Var == gb0.h)) {
            return true;
        }
        return false;
    }

    public static void b(gb0 gb0Var) {
        gb0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (gb0 gb0Var2 : gb0.values()) {
            ComponentName a2 = gb0Var2.a(context);
            if (gb0Var2 == gb0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
