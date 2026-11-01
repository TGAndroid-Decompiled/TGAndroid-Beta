package r7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.ba;
public final class c extends com.google.android.gms.common.api.j {
    public static final com.google.android.gms.common.api.e f46351k = new com.google.android.gms.common.api.e("LocationServices.API", new a8.d(13), new Object());

    public Task f(LocationRequest locationRequest, ba baVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            n6.l.h(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p k10 = za.c.k(looper, baVar, ba.class.getSimpleName());
        androidx.activity.o oVar = new androidx.activity.o(this, k10);
        m4.c cVar = new m4.c(oVar, locationRequest, false, 24);
        ?? obj = new Object();
        obj.f4478b = true;
        obj.f4479c = cVar;
        obj.d = oVar;
        obj.e = k10;
        obj.f4477a = 2436;
        return b(obj.a());
    }
}
