package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.x;
import e9.l0;
import e9.m2;
import e9.y0;
import java.util.HashMap;
import li.c0;
public final class a implements u {
    public final d f44544a;

    public a(d dVar) {
        this.f44544a = dVar;
    }

    @Override
    public final void a() {
        this.f44544a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, x xVar, boolean z10) {
        c cVar;
        d dVar = this.f44544a;
        HashMap hashMap = dVar.d;
        if (dVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.f44555a;
            int size = wVar.f44698b.size();
            m2 it = y0.u(wVar.f44698b.values()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) i0.a.h(cVar3.f44556b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.f44550r) {
                        i10++;
                    }
                }
            }
            int size2 = dVar.f44566x.size();
            l0 listIterator = dVar.f44566x.listIterator(0);
            int i11 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i11++;
                }
            }
            c0 c0Var = new c0(size, i10, size2, i11);
            dVar.f44560c.getClass();
            k4.d p02 = hb.a.p0(c0Var, xVar);
            if (p02 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, p02.f10861b);
            }
        }
        return false;
    }
}
