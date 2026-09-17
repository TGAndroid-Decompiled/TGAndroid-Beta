package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f46730i;
    public g2.c0 f46731j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f46716a.d(kVar.f46717b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f46716a.f(kVar.f46717b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f46716a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f46716a;
            j jVar = kVar.f46718c;
            aVar.p(kVar.f46717b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract f0 u(Object obj, f0 f0Var);

    public abstract void x(Object obj, a aVar, b2.k1 k1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        e2.d.b(!hashMap.containsKey(num));
        ?? r12 = new g0() {
            @Override
            public final void a(a aVar2, b2.k1 k1Var) {
                l.this.x(num, aVar2, k1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.f46730i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.f46607c;
        aVar2.getClass();
        ?? obj = new Object();
        obj.f46711a = handler;
        obj.f46712b = jVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj);
        Handler handler2 = this.f46730i;
        handler2.getClass();
        n2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f16402c;
        ?? obj2 = new Object();
        obj2.f16398a = handler2;
        obj2.f16399b = jVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f46731j;
        j2.k kVar = this.f46610g;
        e2.d.h(kVar);
        aVar.l(r12, c0Var, kVar);
        if (this.f46606b.isEmpty()) {
            aVar.d(r12);
        }
    }

    public long v(Object obj, long j3) {
        return j3;
    }

    public int w(int i10, Object obj) {
        return i10;
    }
}
