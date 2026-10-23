package u2;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import v7.u6;
public abstract class m extends a {
    public final HashMap h = new HashMap();
    public Handler f47366i;
    public g2.c0 f47367j;

    @Override
    public final void e() {
        for (l lVar : this.h.values()) {
            lVar.f47360a.d(lVar.f47361b);
        }
    }

    @Override
    public final void g() {
        for (l lVar : this.h.values()) {
            lVar.f47360a.f(lVar.f47361b);
        }
    }

    @Override
    public void k() {
        for (l lVar : this.h.values()) {
            lVar.f47360a.k();
        }
    }

    @Override
    public void q() {
        HashMap hashMap = this.h;
        for (l lVar : hashMap.values()) {
            a aVar = lVar.f47360a;
            k kVar = lVar.f47362c;
            aVar.p(lVar.f47361b);
            aVar.s(kVar);
            aVar.r(kVar);
        }
        hashMap.clear();
    }

    public abstract g0 u(Object obj, g0 g0Var);

    public abstract void x(Object obj, a aVar, b2.o1 o1Var);

    public final void y(final Integer num, a aVar) {
        HashMap hashMap = this.h;
        u6.g(!hashMap.containsKey(num));
        ?? r12 = new h0() {
            @Override
            public final void a(a aVar2, b2.o1 o1Var) {
                m.this.x(num, aVar2, o1Var);
            }
        };
        k kVar = new k(this, num);
        hashMap.put(num, new l(aVar, r12, kVar));
        Handler handler = this.f47366i;
        handler.getClass();
        aVar.getClass();
        a5.a aVar2 = aVar.f47256c;
        aVar2.getClass();
        ?? obj = new Object();
        obj.f47347a = handler;
        obj.f47348b = kVar;
        ((CopyOnWriteArrayList) aVar2.d).add(obj);
        Handler handler2 = this.f47366i;
        handler2.getClass();
        n2.k kVar2 = aVar.d;
        kVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = kVar2.f17059c;
        ?? obj2 = new Object();
        obj2.f17055a = handler2;
        obj2.f17056b = kVar;
        copyOnWriteArrayList.add(obj2);
        g2.c0 c0Var = this.f47367j;
        j2.k kVar3 = this.f47258g;
        kVar3.getClass();
        aVar.l(r12, c0Var, kVar3);
        if (this.f47255b.isEmpty()) {
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
