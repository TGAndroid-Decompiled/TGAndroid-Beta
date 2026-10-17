package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.qa0;
public abstract class g6 {
    public static boolean a(qa0 qa0Var) {
        Context context = ApplicationLoader.applicationContext;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(qa0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && qa0Var == qa0.h)) {
            return true;
        }
        return false;
    }

    public static void b(qa0 qa0Var) {
        qa0[] values;
        int i10;
        Context context = ApplicationLoader.applicationContext;
        PackageManager packageManager = context.getPackageManager();
        for (qa0 qa0Var2 : qa0.values()) {
            ComponentName a2 = qa0Var2.a(context);
            if (qa0Var2 == qa0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
