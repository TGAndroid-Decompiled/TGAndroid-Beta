package za;

import android.util.Log;
import v7.t7;
public final class w extends kd.j implements rd.q {
    public int f48855a;
    public ce.c f48856b;
    public Throwable f48857c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f48856b = (ce.c) obj;
        jVar.f48857c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f9621a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12970a;
        int i10 = this.f48855a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t7.b(obj);
            ce.c cVar = this.f48856b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f48857c);
            n1.b bVar = new n1.b(true);
            this.f48856b = null;
            this.f48855a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f9621a;
    }
}
