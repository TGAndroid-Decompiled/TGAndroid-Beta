package u6;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.u0;
import f0.e;
public abstract class c extends e {
    public static void g(Context context, u0 u0Var, IntentFilter intentFilter) {
        int i9;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 33) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            context.registerReceiver(u0Var, intentFilter, i9);
            return;
        }
        context.registerReceiver(u0Var, intentFilter);
    }
}
