package x2;

import a8.ia;
import a8.wa;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f58377i;
    public j2.d0 f58378j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f58371a.d(kVar.f58372b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f58371a.f(kVar.f58372b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f58371a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f58371a;
            j jVar = kVar.f58373c;
            aVar.p(kVar.f58372b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract g0 u(Object obj, g0 g0Var);

    public abstract void x(Object obj, a aVar, e2.l1 l1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        ia.f(!hashMap.containsKey(num));
        ?? r12 = new h0() {
            @Override
            public final void a(a aVar2, e2.l1 l1Var) {
                l.this.x(num, aVar2, l1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.f58377i;
        handler.getClass();
        aVar.getClass();
        wa waVar = aVar.f58267c;
        waVar.getClass();
        ?? obj = new Object();
        obj.f58366a = handler;
        obj.f58367b = jVar;
        ((CopyOnWriteArrayList) waVar.d).add(obj);
        Handler handler2 = this.f58377i;
        handler2.getClass();
        q2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f53739c;
        ?? obj2 = new Object();
        obj2.f53735a = handler2;
        obj2.f53736b = jVar;
        copyOnWriteArrayList.add(obj2);
        j2.d0 d0Var = this.f58378j;
        m2.j jVar3 = this.f58270g;
        jVar3.getClass();
        aVar.l(r12, d0Var, jVar3);
        if (this.f58266b.isEmpty()) {
            aVar.d(r12);
        }
    }

    public long v(Object obj, long j3) {
        return j3;
    }

    public int w(int i7, Object obj) {
        return i7;
    }
}
