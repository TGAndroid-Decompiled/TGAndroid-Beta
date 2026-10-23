package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;
public abstract class m extends a {
    public final HashMap h = new HashMap();
    public Handler f47812i;
    public g2.c0 f47813j;

    @Override
    public final void e() {
        for (l lVar : this.h.values()) {
            lVar.f47796a.d(lVar.f47797b);
        }
    }

    @Override
    public final void g() {
        for (l lVar : this.h.values()) {
            lVar.f47796a.f(lVar.f47797b);
        }
    }

    @Override
    public void k() {
        for (l lVar : this.h.values()) {
            lVar.f47796a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (l lVar : hashMap.values()) {
            a aVar = lVar.f47796a;
            k kVar = lVar.f47798c;
            aVar.p(lVar.f47797b);
            aVar.s(kVar);
            aVar.r(kVar);
        }
        hashMap.clear();
    }

    public abstract h0 u(Object obj, h0 h0Var);

    public abstract void x(Object obj, a aVar, b2.o1 o1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        u6.g(!hashMap.containsKey(num));
        ?? r12 = new i0() {
            @Override
            public final void a(a aVar2, b2.o1 o1Var) {
                m.this.x(num, aVar2, o1Var);
            }
        };
        k kVar = new k(this, num);
        hashMap.put(num, new l(aVar, r12, kVar));
        Handler handler = this.f47812i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.f47691c;
        aVar2.getClass();
        ?? obj = new Object();
        obj.f47799a = handler;
        obj.f47800b = kVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj);
        Handler handler2 = this.f47812i;
        handler2.getClass();
        n2.k kVar2 = aVar.d;
        kVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar2.f17122c;
        ?? obj2 = new Object();
        obj2.f17118a = handler2;
        obj2.f17119b = kVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f47813j;
        j2.j jVar = this.f47693g;
        jVar.getClass();
        aVar.l(r12, c0Var, jVar);
        if (this.f47690b.isEmpty()) {
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
