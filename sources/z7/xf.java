package z7;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;
public final class xf {
    public final Object f49868a;
    public Object f49869b;

    public xf(Context context) {
        this.f49869b = new AtomicLong(-1L);
        this.f49868a = new com.google.android.gms.common.api.j(context, p6.b.f42846k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f4900c);
    }

    public void a(Exception exc, boolean z10) {
        int i10;
        this.f49869b = null;
        HashSet hashSet = (HashSet) this.f49868a;
        e9.n0 u10 = e9.n0.u(hashSet);
        hashSet.clear();
        e9.l0 listIterator = u10.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            bVar.l(i10, exc);
        }
    }

    public void b(n2.b bVar) {
        ((HashSet) this.f49868a).add(bVar);
        if (((n2.b) this.f49869b) != null) {
            return;
        }
        this.f49869b = bVar;
        n2.p p5 = bVar.f15634b.p();
        bVar.f15654z = p5;
        android.support.v4.media.session.f fVar = bVar.f15648s;
        String str = e2.m0.f8375a;
        p5.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.u.f46053g.getAndIncrement(), true, SystemClock.elapsedRealtime(), p5)).sendToTarget();
    }

    public xf() {
        this.f49868a = new HashSet();
    }
}
