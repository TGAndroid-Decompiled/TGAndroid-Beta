package x2;

import a8.ja;
import a8.xa;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f59583i;
    public j2.c0 f59584j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f59567a.d(kVar.f59568b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f59567a.f(kVar.f59568b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f59567a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f59567a;
            j jVar = kVar.f59569c;
            aVar.p(kVar.f59568b);
            aVar.s(jVar);
            aVar.r(jVar);
        }
        hashMap.clear();
    }

    public abstract f0 u(Object obj, f0 f0Var);

    public abstract void x(Object obj, a aVar, e2.l1 l1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        ja.f(!hashMap.containsKey(num));
        ?? r12 = new g0() {
            @Override
            public final void a(a aVar2, e2.l1 l1Var) {
                l.this.x(num, aVar2, l1Var);
            }
        };
        j jVar = new j(this, num);
        hashMap.put(num, new k(aVar, r12, jVar));
        Handler handler = this.f59583i;
        handler.getClass();
        aVar.getClass();
        xa xaVar = aVar.f59461c;
        xaVar.getClass();
        ?? obj = new Object();
        obj.f59556a = handler;
        obj.f59557b = jVar;
        ((CopyOnWriteArrayList) xaVar.d).add(obj);
        Handler handler2 = this.f59583i;
        handler2.getClass();
        q2.k kVar = aVar.d;
        kVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar.f55187c;
        ?? obj2 = new Object();
        obj2.f55183a = handler2;
        obj2.f55184b = jVar;
        copyOnWriteArrayList.add(obj2);
        j2.c0 c0Var = this.f59584j;
        m2.j jVar2 = this.f59464g;
        jVar2.getClass();
        aVar.l(r12, c0Var, jVar2);
        if (this.f59460b.isEmpty()) {
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
