package za;

import android.util.Log;
import v7.t7;
public final class w extends kd.j implements rd.q {
    public int f51480a;
    public ce.c f51481b;
    public Throwable f51482c;

    @Override
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        ?? jVar = new kd.j(3, cVar);
        jVar.f51481b = (ce.c) obj;
        jVar.f51482c = (Throwable) obj2;
        return jVar.invokeSuspend(gd.i.f10588a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.f13614a;
        int i10 = this.f51480a;
        if (i10 != 0) {
            if (i10 == 1) {
                t7.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t7.b(obj);
            ce.c cVar = this.f51481b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f51482c);
            n1.b bVar = new n1.b(true);
            this.f51481b = null;
            this.f51480a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return gd.i.f10588a;
    }
}
