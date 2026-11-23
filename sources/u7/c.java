package u7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.x9;
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e f58563l = new com.google.android.gms.common.api.e("LocationServices.API", new a9.e(18), new Object());

    public Task f(LocationRequest locationRequest, x9 x9Var, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            q6.m.i(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.o p10 = d6.i.p(looper, x9Var, x9.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n(this, p10);
        t1.a aVar = new t1.a(2, nVar, locationRequest);
        ?? obj = new Object();
        obj.f6334b = true;
        obj.f6335c = aVar;
        obj.d = nVar;
        obj.f6336e = p10;
        obj.f6333a = 2436;
        return b(obj.a());
    }
}
