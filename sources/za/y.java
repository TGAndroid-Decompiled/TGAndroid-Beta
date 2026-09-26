package za;

import android.util.Log;
import v7.u7;
public final class y extends kd.j implements rd.q {
    public int f49111a;
    public ce.c f49112b;
    public Throwable f49113c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f49112b = (ce.c) obj;
        jVar.f49113c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f9602a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12959a;
        int i10 = this.f49111a;
        if (i10 != 0) {
            if (i10 == 1) {
                u7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            u7.b(obj);
            ce.c cVar = this.f49112b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f49113c);
            n1.b bVar = new n1.b(true);
            this.f49112b = null;
            this.f49111a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f9602a;
    }
}
