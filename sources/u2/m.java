package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class m extends a {
    public final HashMap h = new HashMap();
    public Handler f42378i;
    public g2.c0 f42379j;

    @Override
    public final void e() {
        for (l lVar : this.h.values()) {
            lVar.f42370a.d(lVar.f42371b);
        }
    }

    @Override
    public final void g() {
        for (l lVar : this.h.values()) {
            lVar.f42370a.f(lVar.f42371b);
        }
    }

    @Override
    public void k() {
        for (l lVar : this.h.values()) {
            lVar.f42370a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (l lVar : hashMap.values()) {
            a aVar = lVar.f42370a;
            k kVar = lVar.f42372c;
            aVar.p(lVar.f42371b);
            aVar.s(kVar);
            aVar.r(kVar);
        }
        hashMap.clear();
    }

    public abstract g0 u(Object obj, g0 g0Var);

    public abstract void x(Object obj, a aVar, b2.k1 k1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        e2.d.b(!hashMap.containsKey(num));
        ?? r12 = new h0() {
            @Override
            public final void a(a aVar2, b2.k1 k1Var) {
                m.this.x(num, aVar2, k1Var);
            }
        };
        k kVar = new k(this, num);
        hashMap.put(num, new l(aVar, r12, kVar));
        Handler handler = this.f42378i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.f42268c;
        aVar2.getClass();
        ?? obj = new Object();
        obj.f42373a = handler;
        obj.f42374b = kVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj);
        Handler handler2 = this.f42378i;
        handler2.getClass();
        n2.j jVar = aVar.d;
        jVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar.f13736c;
        ?? obj2 = new Object();
        obj2.f13732a = handler2;
        obj2.f13733b = kVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f42379j;
        j2.k kVar2 = this.f42270g;
        e2.d.h(kVar2);
        aVar.l(r12, c0Var, kVar2);
        if (this.f42267b.isEmpty()) {
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
