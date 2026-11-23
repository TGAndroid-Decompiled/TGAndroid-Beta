package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.y9;
import tg.y;
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e f58483l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new Object());

    public Task f(LocationRequest locationRequest, y9 y9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.i(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o o4 = d6.i.o(looper, y9Var, y9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, o4);
        y yVar = new y(1, nVar, locationRequest);
        ?? obj = new Object();
        obj.f6374b = true;
        obj.f6375c = yVar;
        obj.d = nVar;
        obj.f6376e = o4;
        obj.f6373a = 2436;
        return b(obj.a());
    }
}
