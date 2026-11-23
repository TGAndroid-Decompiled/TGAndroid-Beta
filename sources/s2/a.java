package s2;

import android.net.Uri;
import android.os.SystemClock;
import h9.g0;
import h9.h2;
import h9.t0;
import java.util.HashMap;
public final class a implements u {
    public final d f56752a;

    public a(d dVar) {
        this.f56752a = dVar;
    }

    @Override
    public final void a() {
        this.f56752a.f56770e.remove(this);
    }

    @Override
    public final boolean d(Uri uri, b3.j jVar, boolean z10) {
        c cVar;
        d dVar = this.f56752a;
        HashMap hashMap = dVar.d;
        if (dVar.H == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.f56764a;
            int size = wVar.f56916b.size();
            h2 it = t0.q(wVar.f56916b.values()).iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) p5.c.i(cVar3.f56765b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.f56759r) {
                        i7++;
                    }
                }
            }
            int size2 = dVar.f56776x.size();
            g0 listIterator = dVar.f56776x.listIterator(0);
            int i10 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i10++;
                }
            }
            b3.h hVar = new b3.h(size, i7, size2, i10);
            dVar.f56769c.getClass();
            b3.i Q4 = qb.a.Q4(hVar, jVar);
            if (Q4 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, Q4.f2870b);
            }
        }
        return false;
    }
}
