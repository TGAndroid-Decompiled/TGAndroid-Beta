package w2;

import android.os.Handler;
import b8.kg;
import b8.zb;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f57128i;
    public i2.d0 f57129j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f57122a.d(kVar.f57123b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f57122a.f(kVar.f57123b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f57122a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f57122a;
            j jVar = kVar.f57124c;
            aVar.p(kVar.f57123b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract g0 u(Object obj, g0 g0Var);

    public abstract void x(Object obj, a aVar, d2.n1 n1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        zb.f(!hashMap.containsKey(num));
        ?? r12 = new h0() {
            @Override
            public final void a(a aVar2, d2.n1 n1Var) {
                l.this.x(num, aVar2, n1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.f57128i;
        handler.getClass();
        aVar.getClass();
        kg kgVar = aVar.f57019c;
        kgVar.getClass();
        ?? obj = new Object();
        obj.f57108a = handler;
        obj.f57109b = jVar;
        ((CopyOnWriteArrayList) kgVar.d).add(obj);
        Handler handler2 = this.f57128i;
        handler2.getClass();
        p2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f53117c;
        ?? obj2 = new Object();
        obj2.f53113a = handler2;
        obj2.f53114b = jVar;
        copyOnWriteArrayList.add(obj2);
        i2.d0 d0Var = this.f57129j;
        l2.k kVar = this.f57022g;
        kVar.getClass();
        aVar.l(r12, d0Var, kVar);
        if (this.f57018b.isEmpty()) {
            aVar.d(r12);
        }
    }

    public long v(Object obj, long j10) {
        return j10;
    }

    public int w(int i3, Object obj) {
        return i3;
    }
}
