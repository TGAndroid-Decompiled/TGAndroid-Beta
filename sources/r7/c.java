package r7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
public final class c extends com.google.android.gms.common.api.j implements g8.a, g8.i {
    public static final com.google.android.gms.common.api.e f45454k = new com.google.android.gms.common.api.e("LocationServices.API", new a8.d(13), new Object());

    public Task f(LocationRequest locationRequest, g8.c cVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            n6.l.i(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p d = qb.c.d(looper, cVar, g8.c.class.getSimpleName());
        ?? obj = new Object();
        obj.f2676c = this;
        obj.f2674a = true;
        obj.f2675b = d;
        n2.e eVar = new n2.e(15, (Object) obj, locationRequest);
        ?? obj2 = new Object();
        obj2.f919a = true;
        obj2.f921c = eVar;
        obj2.d = obj;
        obj2.e = d;
        obj2.f920b = 2436;
        return b(obj2.a());
    }
}
