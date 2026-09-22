package za;

import android.util.Log;
import v7.u7;
public final class w extends kd.j implements rd.q {
    public int f49152a;
    public ce.c f49153b;
    public Throwable f49154c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f49153b = (ce.c) obj;
        jVar.f49154c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f9621a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12971a;
        int i10 = this.f49152a;
        if (i10 != 0) {
            if (i10 == 1) {
                u7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            u7.b(obj);
            ce.c cVar = this.f49153b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f49154c);
            n1.b bVar = new n1.b(true);
            this.f49153b = null;
            this.f49152a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f9621a;
    }
}
