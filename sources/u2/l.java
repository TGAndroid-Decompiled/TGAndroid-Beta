package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f43728i;
    public g2.c0 f43729j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f43720a.d(kVar.f43721b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f43720a.f(kVar.f43721b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f43720a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f43720a;
            j jVar = kVar.f43722c;
            aVar.p(kVar.f43721b);
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
        Handler handler = this.f43728i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.f43621c;
        aVar2.getClass();
        ?? obj = new Object();
        obj.f43723a = handler;
        obj.f43724b = jVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj);
        Handler handler2 = this.f43728i;
        handler2.getClass();
        n2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f15144c;
        ?? obj2 = new Object();
        obj2.f15140a = handler2;
        obj2.f15141b = jVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f43729j;
        j2.k kVar = this.f43623g;
        e2.d.h(kVar);
        aVar.l(r12, c0Var, kVar);
        if (this.f43620b.isEmpty()) {
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
