package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f47308i;
    public g2.c0 f47309j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f47302a.d(kVar.f47303b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f47302a.f(kVar.f47303b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f47302a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f47302a;
            j jVar = kVar.f47304c;
            aVar.p(kVar.f47303b);
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
        Handler handler = this.f47308i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.f47197c;
        aVar2.getClass();
        ?? obj = new Object();
        obj.f47297a = handler;
        obj.f47298b = jVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj);
        Handler handler2 = this.f47308i;
        handler2.getClass();
        n2.k kVar = aVar.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f16546c;
        ?? obj2 = new Object();
        obj2.f16542a = handler2;
        obj2.f16543b = jVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f47309j;
        j2.k kVar2 = this.f47200g;
        e2.d.h(kVar2);
        aVar.l(r12, c0Var, kVar2);
        if (this.f47196b.isEmpty()) {
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
