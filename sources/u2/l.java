package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f43443i;
    public g2.c0 f43444j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f43430a.d(kVar.f43431b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f43430a.f(kVar.f43431b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f43430a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f43430a;
            j jVar = kVar.f43432c;
            aVar.p(kVar.f43431b);
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
        Handler handler = this.f43443i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.f43329c;
        aVar2.getClass();
        ?? obj = new Object();
        obj.f43425a = handler;
        obj.f43426b = jVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj);
        Handler handler2 = this.f43443i;
        handler2.getClass();
        n2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f14917c;
        ?? obj2 = new Object();
        obj2.f14913a = handler2;
        obj2.f14914b = jVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f43444j;
        j2.k kVar = this.f43331g;
        e2.d.h(kVar);
        aVar.l(r12, c0Var, kVar);
        if (this.f43328b.isEmpty()) {
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
