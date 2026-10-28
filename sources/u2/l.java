package u2;

import a8.ng;
import a8.yb;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f49377i;
    public g2.c0 f49378j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f49371a.d(kVar.f49372b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f49371a.f(kVar.f49372b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f49371a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f49371a;
            j jVar = kVar.f49373c;
            aVar.p(kVar.f49372b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract g0 u(Object obj, g0 g0Var);

    public abstract void x(Object obj, a aVar, b2.p1 p1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        yb.g(!hashMap.containsKey(num));
        ?? r12 = new h0() {
            @Override
            public final void a(a aVar2, b2.p1 p1Var) {
                l.this.x(num, aVar2, p1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.f49377i;
        handler.getClass();
        aVar.getClass();
        ng ngVar = aVar.f49276c;
        ngVar.getClass();
        ?? obj = new Object();
        obj.f49358a = handler;
        obj.f49359b = jVar;
        ((CopyOnWriteArrayList) ngVar.d).add(obj);
        Handler handler2 = this.f49377i;
        handler2.getClass();
        n2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f18626c;
        ?? obj2 = new Object();
        obj2.f18622a = handler2;
        obj2.f18623b = jVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f49378j;
        j2.j jVar3 = this.f49278g;
        jVar3.getClass();
        aVar.l(r12, c0Var, jVar3);
        if (this.f49275b.isEmpty()) {
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
