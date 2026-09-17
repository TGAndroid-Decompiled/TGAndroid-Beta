package za;

import android.util.Log;
import v7.t7;
public final class w extends kd.j implements rd.q {
    public int f51512a;
    public ce.c f51513b;
    public Throwable f51514c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f51513b = (ce.c) obj;
        jVar.f51514c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f10616a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f13640a;
        int i10 = this.f51512a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t7.b(obj);
            ce.c cVar = this.f51513b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f51514c);
            n1.b bVar = new n1.b(true);
            this.f51513b = null;
            this.f51512a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f10616a;
    }
}
