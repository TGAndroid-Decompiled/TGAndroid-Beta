package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.x9;
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e f58437l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new Object());

    public Task f(LocationRequest locationRequest, x9 x9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.i(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o o4 = d6.i.o(looper, x9Var, x9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, o4);
        tg.x xVar = new tg.x(1, nVar, locationRequest);
        ?? obj = new Object();
        obj.f6345b = true;
        obj.f6346c = xVar;
        obj.d = nVar;
        obj.f6347e = o4;
        obj.f6344a = 2436;
        return b(obj.a());
    }
}
