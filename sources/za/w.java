package za;

import android.util.Log;
import v7.u7;
public final class w extends kd.j implements rd.q {
    public int f49148a;
    public ce.c f49149b;
    public Throwable f49150c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f49149b = (ce.c) obj;
        jVar.f49150c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f9608a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12962a;
        int i10 = this.f49148a;
        if (i10 != 0) {
            if (i10 == 1) {
                u7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            u7.b(obj);
            ce.c cVar = this.f49149b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f49150c);
            n1.b bVar = new n1.b(true);
            this.f49149b = null;
            this.f49148a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f9608a;
    }
}
