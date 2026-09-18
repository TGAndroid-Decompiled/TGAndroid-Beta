package za;

import android.util.Log;
import v7.t7;
public final class w extends kd.j implements rd.q {
    public int f49086a;
    public ce.c f49087b;
    public Throwable f49088c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f49087b = (ce.c) obj;
        jVar.f49088c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f9620a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f12970a;
        int i10 = this.f49086a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t7.b(obj);
            ce.c cVar = this.f49087b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f49088c);
            n1.b bVar = new n1.b(true);
            this.f49087b = null;
            this.f49086a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f9620a;
    }
}
