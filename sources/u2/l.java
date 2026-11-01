package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.t6;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f49934i;
    public g2.d0 f49935j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f49928a.d(kVar.f49929b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f49928a.f(kVar.f49929b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f49928a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f49928a;
            j jVar = kVar.f49930c;
            aVar.p(kVar.f49929b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract g0 u(Object obj, g0 g0Var);

    public abstract void x(Object obj, a aVar, b2.o1 o1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        t6.f(!hashMap.containsKey(num));
        ?? r12 = new h0() {
            @Override
            public final void a(a aVar2, b2.o1 o1Var) {
                l.this.x(num, aVar2, o1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.f49934i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.f49833c;
        aVar2.getClass();
        ?? obj = new Object();
        obj.f49915a = handler;
        obj.f49916b = jVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj);
        Handler handler2 = this.f49934i;
        handler2.getClass();
        n2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f13464c;
        ?? obj2 = new Object();
        obj2.f13460a = handler2;
        obj2.f13461b = jVar;
        copyOnWriteArrayList.add(obj2);
        g2.d0 d0Var = this.f49935j;
        j2.l lVar = this.f49835g;
        lVar.getClass();
        aVar.l(r12, d0Var, lVar);
        if (this.f49832b.isEmpty()) {
            aVar.d(r12);
        }
    }

    public long v(Object obj, long j10) {
        return j10;
    }

    public int w(int i10, Object obj) {
        return i10;
    }
}
