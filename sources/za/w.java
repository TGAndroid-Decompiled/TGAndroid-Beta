package za;

import android.util.Log;
import v7.u7;
public final class w extends kd.j implements rd.q {
    public int f47952a;
    public ce.c f47953b;
    public Throwable f47954c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f47953b = (ce.c) obj;
        jVar.f47954c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f8748a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f11861a;
        int i10 = this.f47952a;
        if (i10 != 0) {
            if (i10 == 1) {
                u7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            u7.b(obj);
            ce.c cVar = this.f47953b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f47954c);
            n1.b bVar = new n1.b(true);
            this.f47953b = null;
            this.f47952a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f8748a;
    }
}
