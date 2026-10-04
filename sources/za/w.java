package za;

import android.util.Log;
import v7.t7;
public final class w extends kd.j implements rd.q {
    public int f53152a;
    public ce.c f53153b;
    public Throwable f53154c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f53153b = (ce.c) obj;
        jVar.f53154c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f10452a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f14087a;
        int i10 = this.f53152a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t7.b(obj);
            ce.c cVar = this.f53153b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f53154c);
            n1.b bVar = new n1.b(true);
            this.f53153b = null;
            this.f53152a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f10452a;
    }
}
