package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f47397i;
    public g2.c0 f47398j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f47389a.d(kVar.f47390b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f47389a.f(kVar.f47390b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f47389a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f47389a;
            j jVar = kVar.f47391c;
            aVar.p(kVar.f47390b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract f0 u(Object obj, f0 f0Var);

    public abstract void x(Object obj, a aVar, b2.o1 o1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        u6.g(!hashMap.containsKey(num));
        ?? r12 = new g0() {
            @Override
            public final void a(a aVar2, b2.o1 o1Var) {
                l.this.x(num, aVar2, o1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.f47397i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.f47293c;
        aVar2.getClass();
        ?? obj = new Object();
        obj.f47370a = handler;
        obj.f47371b = jVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj);
        Handler handler2 = this.f47397i;
        handler2.getClass();
        n2.k kVar = aVar.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f17062c;
        ?? obj2 = new Object();
        obj2.f17058a = handler2;
        obj2.f17059b = jVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f47398j;
        j2.k kVar2 = this.f47295g;
        kVar2.getClass();
        aVar.l(r12, c0Var, kVar2);
        if (this.f47292b.isEmpty()) {
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
