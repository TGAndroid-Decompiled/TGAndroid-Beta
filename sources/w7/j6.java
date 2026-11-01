package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import org.telegram.ui.aa0;
public abstract class j6 {
    public static boolean a(aa0 aa0Var) {
        Context context = org.telegram.messenger.w0.f18945b;
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(aa0Var.a(context));
        if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && aa0Var == aa0.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static void b(aa0 aa0Var) {
        aa0[] values;
        int i10;
        Context context = org.telegram.messenger.w0.f18945b;
        PackageManager packageManager = context.getPackageManager();
        for (aa0 aa0Var2 : aa0.values()) {
            ComponentName a2 = aa0Var2.a(context);
            if (aa0Var2 == aa0Var) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(a2, i10, 1);
        }
    }
}
