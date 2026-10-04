package za;

import android.util.Log;
import v7.t7;
public final class w extends kd.j implements rd.q {
    public int f53153a;
    public ce.c f53154b;
    public Throwable f53155c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f53154b = (ce.c) obj;
        jVar.f53155c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f10452a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f14087a;
        int i10 = this.f53153a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t7.b(obj);
            ce.c cVar = this.f53154b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f53155c);
            n1.b bVar = new n1.b(true);
            this.f53154b = null;
            this.f53153a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f10452a;
    }
}
