package y6;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.u0;
import f0.f;
public abstract class c extends f {
    public static void g(Context context, u0 u0Var, IntentFilter intentFilter) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            if (i11 >= 33) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            context.registerReceiver(u0Var, intentFilter, i10);
            return;
        }
        context.registerReceiver(u0Var, intentFilter);
    }
}
