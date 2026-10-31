package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.ba0;
public abstract class j6 {
    public static boolean a(ba0 ba0Var) {
        Context context = org.telegram.messenger.w0.f19025b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(ba0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && ba0Var == ba0.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static void b(ba0 ba0Var) {
        ba0[] values;
        int i10;
        Context context = org.telegram.messenger.w0.f19025b;
        PackageManager packageManager = context.getPackageManager();
        for (ba0 ba0Var2 : ba0.values()) {
            ComponentName a2 = ba0Var2.a(context);
            if (ba0Var2 == ba0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
