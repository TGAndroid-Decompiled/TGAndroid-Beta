package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.y9;
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e f57870l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new Object());

    public Task f(LocationRequest locationRequest, y9 y9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.h(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o h = cb.c.h(looper, y9Var, y9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, h);
        tg.x xVar = new tg.x(1, nVar, locationRequest);
        ?? obj = new Object();
        obj.f6062b = true;
        obj.f6063c = xVar;
        obj.d = nVar;
        obj.f6064e = h;
        obj.f6061a = 2436;
        return b(obj.a());
    }
}
