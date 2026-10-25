package p2;

import android.net.Uri;
import android.os.SystemClock;
import d5.z;
import f9.g0;
import f9.g2;
import f9.t0;
import java.util.HashMap;
import vi.y;
public final class a implements u {
    public final d f46483a;

    public a(d dVar) {
        this.f46483a = dVar;
    }

    @Override
    public final void a() {
        this.f46483a.e.remove(this);
    }

    @Override
    public final boolean d(Uri uri, z zVar, boolean z10) {
        c cVar;
        d dVar = this.f46483a;
        HashMap hashMap = dVar.d;
        if (dVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.f46493a;
            int size = wVar.f46635b.size();
            g2 it = t0.u(wVar.f46635b.values()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) ic.a.h(cVar3.f46494b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.f46489r) {
                        i10++;
                    }
                }
            }
            int size2 = dVar.f46503w.size();
            g0 listIterator = dVar.f46503w.listIterator(0);
            int i11 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i11++;
                }
            }
            y yVar = new y(size, i10, size2, i11);
            dVar.f46498c.getClass();
            k4.d z02 = u7.s.z0(yVar, zVar);
            if (z02 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, z02.f16378b);
            }
        }
        return false;
    }
}
