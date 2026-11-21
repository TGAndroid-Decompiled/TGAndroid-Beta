package x2;

import a8.la;
import a8.xa;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f60176i;
    public j2.c0 f60177j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f60170a.d(kVar.f60171b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f60170a.f(kVar.f60171b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f60170a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f60170a;
            j jVar = kVar.f60172c;
            aVar.p(kVar.f60171b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract g0 u(Object obj, g0 g0Var);

    public abstract void x(Object obj, a aVar, e2.l1 l1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        la.f(!hashMap.containsKey(num));
        ?? r12 = new h0() {
            @Override
            public final void a(a aVar2, e2.l1 l1Var) {
                l.this.x(num, aVar2, l1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.f60176i;
        handler.getClass();
        aVar.getClass();
        xa xaVar = aVar.f60067c;
        xaVar.getClass();
        ?? obj = new Object();
        obj.f60156a = handler;
        obj.f60157b = jVar;
        ((CopyOnWriteArrayList) xaVar.d).add(obj);
        Handler handler2 = this.f60176i;
        handler2.getClass();
        q2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f55802c;
        ?? obj2 = new Object();
        obj2.f55798a = handler2;
        obj2.f55799b = jVar;
        copyOnWriteArrayList.add(obj2);
        j2.c0 c0Var = this.f60177j;
        m2.i iVar = this.f60070g;
        iVar.getClass();
        aVar.l(r12, c0Var, iVar);
        if (this.f60066b.isEmpty()) {
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
