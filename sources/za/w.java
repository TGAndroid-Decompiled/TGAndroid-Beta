package za;

import android.util.Log;
import v7.t7;
public final class w extends kd.j implements rd.q {
    public int f48832a;
    public ce.c f48833b;
    public Throwable f48834c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f48833b = (ce.c) obj;
        jVar.f48834c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f9616a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12967a;
        int i10 = this.f48832a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t7.b(obj);
            ce.c cVar = this.f48833b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f48834c);
            n1.b bVar = new n1.b(true);
            this.f48833b = null;
            this.f48832a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f9616a;
    }
}
