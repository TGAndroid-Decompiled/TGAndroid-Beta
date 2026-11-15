package s2;

import android.net.Uri;
import android.os.SystemClock;
import h9.g0;
import h9.g2;
import h9.t0;
import java.util.HashMap;
public final class a implements u {
    public final d f56168a;

    public a(d dVar) {
        this.f56168a = dVar;
    }

    @Override
    public final void a() {
        this.f56168a.f56186e.remove(this);
    }

    @Override
    public final boolean d(Uri uri, f5.v vVar, boolean z10) {
        c cVar;
        d dVar = this.f56168a;
        HashMap hashMap = dVar.d;
        if (dVar.H == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.f56180a;
            int size = wVar.f56332b.size();
            g2 it = t0.q(wVar.f56332b.values()).iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) r.b.i(cVar3.f56181b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.f56175r) {
                        i7++;
                    }
                }
            }
            int size2 = dVar.f56192x.size();
            g0 listIterator = dVar.f56192x.listIterator(0);
            int i10 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i10++;
                }
            }
            b3.h hVar = new b3.h(size, i7, size2, i10);
            dVar.f56185c.getClass();
            b3.i Q4 = qb.a.Q4(hVar, vVar);
            if (Q4 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, Q4.f2908b);
            }
        }
        return false;
    }
}
