package za;

import android.util.Log;
import v7.t7;
public final class w extends kd.j implements rd.q {
    public int f51511a;
    public ce.c f51512b;
    public Throwable f51513c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f51512b = (ce.c) obj;
        jVar.f51513c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f10616a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f13640a;
        int i10 = this.f51511a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t7.b(obj);
            ce.c cVar = this.f51512b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f51513c);
            n1.b bVar = new n1.b(true);
            this.f51512b = null;
            this.f51511a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f10616a;
    }
}
