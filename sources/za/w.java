package za;

import android.util.Log;
import v7.u7;
public final class w extends kd.j implements rd.q {
    public int f49132a;
    public ce.c f49133b;
    public Throwable f49134c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f49133b = (ce.c) obj;
        jVar.f49134c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f9621a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12971a;
        int i10 = this.f49132a;
        if (i10 != 0) {
            if (i10 == 1) {
                u7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            u7.b(obj);
            ce.c cVar = this.f49133b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f49134c);
            n1.b bVar = new n1.b(true);
            this.f49133b = null;
            this.f49132a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f9621a;
    }
}
