package u2;

import a8.ng;
import a8.yb;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public abstract class l extends a {
    public final HashMap h = new HashMap();
    public Handler f49339i;
    public g2.c0 f49340j;

    @Override
    public final void e() {
        for (k kVar : this.h.values()) {
            kVar.f49333a.d(kVar.f49334b);
        }
    }

    @Override
    public final void g() {
        for (k kVar : this.h.values()) {
            kVar.f49333a.f(kVar.f49334b);
        }
    }

    @Override
    public void k() {
        for (k kVar : this.h.values()) {
            kVar.f49333a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (k kVar : hashMap.values()) {
            a aVar = kVar.f49333a;
            j jVar = kVar.f49335c;
            aVar.p(kVar.f49334b);
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
        Handler handler = this.f49339i;
        handler.getClass();
        aVar.getClass();
        ng ngVar = aVar.f49238c;
        ngVar.getClass();
        ?? obj = new Object();
        obj.f49320a = handler;
        obj.f49321b = jVar;
        ((CopyOnWriteArrayList) ngVar.d).add(obj);
        Handler handler2 = this.f49339i;
        handler2.getClass();
        n2.j jVar2 = aVar.d;
        jVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f18627c;
        ?? obj2 = new Object();
        obj2.f18623a = handler2;
        obj2.f18624b = jVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f49340j;
        j2.j jVar3 = this.f49240g;
        jVar3.getClass();
        aVar.l(r12, c0Var, jVar3);
        if (this.f49237b.isEmpty()) {
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
