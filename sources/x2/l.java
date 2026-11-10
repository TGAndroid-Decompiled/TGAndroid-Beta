package x2;

import a8.ia;
import a8.wa;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f58402i;
    public j2.d0 f58403j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f58386a.d(kVar.f58387b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f58386a.f(kVar.f58387b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f58386a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f58386a;
            j jVar = kVar.f58388c;
            aVar.p(kVar.f58387b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract f0 u(Object obj, f0 f0Var);

    public abstract void x(Object obj, a aVar, e2.l1 l1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        ia.f(!hashMap.containsKey(num));
        ?? r12 = new g0() {
            @Override
            public final void a(a aVar2, e2.l1 l1Var) {
                l.this.x(num, aVar2, l1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.f58402i;
        handler.getClass();
        aVar.getClass();
        wa waVar = aVar.f58280c;
        waVar.getClass();
        ?? obj = new Object();
        obj.f58375a = handler;
        obj.f58376b = jVar;
        ((CopyOnWriteArrayList) waVar.d).add(obj);
        Handler handler2 = this.f58402i;
        handler2.getClass();
        q2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f53750c;
        ?? obj2 = new Object();
        obj2.f53746a = handler2;
        obj2.f53747b = jVar;
        copyOnWriteArrayList.add(obj2);
        j2.d0 d0Var = this.f58403j;
        m2.j jVar3 = this.f58283g;
        jVar3.getClass();
        aVar.l(r12, d0Var, jVar3);
        if (this.f58279b.isEmpty()) {
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
