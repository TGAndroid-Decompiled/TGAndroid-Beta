package za;

import android.util.Log;
import v7.a8;
public final class x extends ld.j implements sd.q {
    public int f54291a;
    public de.c f54292b;
    public Throwable f54293c;

    @Override
    public final Object c(Object obj, Object obj2, ld.c cVar) {
        ?? jVar = new ld.j(3, cVar);
        jVar.f54292b = (de.c) obj;
        jVar.f54293c = (Throwable) obj2;
        return jVar.invokeSuspend(hd.i.f11092a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.f14784a;
        int i10 = this.f54291a;
        if (i10 != 0) {
            if (i10 == 1) {
                a8.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a8.b(obj);
            de.c cVar = this.f54292b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f54293c);
            n1.b bVar = new n1.b(true);
            this.f54292b = null;
            this.f54291a = 1;
            if (cVar.b(bVar, this) == aVar) {
                return aVar;
            }
        }
        return hd.i.f11092a;
    }
}
