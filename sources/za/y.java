package za;

import android.util.Log;
import v7.u7;
public final class y extends kd.j implements rd.q {
    public int f49112a;
    public ce.c f49113b;
    public Throwable f49114c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f49113b = (ce.c) obj;
        jVar.f49114c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f9602a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12959a;
        int i10 = this.f49112a;
        if (i10 != 0) {
            if (i10 == 1) {
                u7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            u7.b(obj);
            ce.c cVar = this.f49113b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f49114c);
            n1.b bVar = new n1.b(true);
            this.f49113b = null;
            this.f49112a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f9602a;
    }
}
