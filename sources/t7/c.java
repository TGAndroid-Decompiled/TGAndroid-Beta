package t7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import mi.h0;
import org.telegram.messenger.t9;
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e f54952l = new com.google.android.gms.common.api.e("LocationServices.API", new a6.b(16), new Object());

    public Task f(LocationRequest locationRequest, t9 t9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            p6.m.h(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o x10 = c6.i.x(looper, t9Var, t9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, x10);
        h0 h0Var = new h0(nVar, locationRequest, false, 22);
        ?? obj = new Object();
        obj.f4782a = true;
        obj.f4784c = h0Var;
        obj.d = nVar;
        obj.f4785e = x10;
        obj.f4783b = 2436;
        return b(obj.a());
    }
}
