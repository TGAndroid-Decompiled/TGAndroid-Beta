package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.x9;
import tg.y;
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e f58479l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new Object());

    public Task f(LocationRequest locationRequest, x9 x9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.i(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o o4 = d6.i.o(looper, x9Var, x9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, o4);
        y yVar = new y(1, nVar, locationRequest);
        ?? obj = new Object();
        obj.f6371b = true;
        obj.f6372c = yVar;
        obj.d = nVar;
        obj.f6373e = o4;
        obj.f6370a = 2436;
        return b(obj.a());
    }
}
