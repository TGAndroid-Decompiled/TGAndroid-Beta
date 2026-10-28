package s7;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import m4.w1;
public final class c extends com.google.android.gms.common.api.j implements h8.a, h8.i {
    public static final com.google.android.gms.common.api.e f47931k = new com.google.android.gms.common.api.e("LocationServices.API", new b8.d(13), new Object());

    public Task f(LocationRequest locationRequest, h8.c cVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            o6.l.i(looper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p l4 = za.c.l(looper, cVar, h8.c.class.getSimpleName());
        ?? obj = new Object();
        obj.f2122c = this;
        obj.f2120a = true;
        obj.f2121b = l4;
        w1 w1Var = new w1(20, (Object) obj, locationRequest);
        ?? obj2 = new Object();
        obj2.f4242a = true;
        obj2.f4244c = w1Var;
        obj2.d = obj;
        obj2.e = l4;
        obj2.f4243b = 2436;
        return b(obj2.a());
    }
}
