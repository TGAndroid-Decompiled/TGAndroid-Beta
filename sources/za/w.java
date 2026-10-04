package za;

import android.util.Log;
import v7.t7;
public final class w extends kd.j implements rd.q {
    public int f53158a;
    public ce.c f53159b;
    public Throwable f53160c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f53159b = (ce.c) obj;
        jVar.f53160c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f10453a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f14088a;
        int i10 = this.f53158a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t7.b(obj);
            ce.c cVar = this.f53159b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f53160c);
            n1.b bVar = new n1.b(true);
            this.f53159b = null;
            this.f53158a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f10453a;
    }
}
