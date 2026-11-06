package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import m4.d0;
import org.telegram.messenger.z9;
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e f56272l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new Object());

    public Task f(LocationRequest locationRequest, z9 z9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.h(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o o4 = cb.c.o(looper, z9Var, z9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, o4);
        d0 d0Var = new d0(nVar, locationRequest);
        ?? obj = new Object();
        obj.f3412a = true;
        obj.f3414c = d0Var;
        obj.d = nVar;
        obj.f3415e = o4;
        obj.f3413b = 2436;
        return b(obj.a());
    }
}
