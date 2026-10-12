package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.c0;
import e9.l0;
import e9.m2;
import e9.y0;
import java.util.HashMap;
import li.a0;
public final class a implements u {
    public final d f42833a;

    public a(d dVar) {
        this.f42833a = dVar;
    }

    @Override
    public final void a() {
        this.f42833a.e.remove(this);
    }

    @Override
    public final boolean d(Uri uri, c0 c0Var, boolean z10) {
        c cVar;
        d dVar = this.f42833a;
        HashMap hashMap = dVar.d;
        if (dVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.f42843a;
            int size = wVar.f42985b.size();
            m2 it = y0.u(wVar.f42985b.values()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) i2.d.h(cVar3.f42844b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.f42839r) {
                        i10++;
                    }
                }
            }
            int size2 = dVar.f42853w.size();
            l0 listIterator = dVar.f42853w.listIterator(0);
            int i11 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i11++;
                }
            }
            a0 a0Var = new a0(size, i10, size2, i11);
            dVar.f42848c.getClass();
            k4.d x32 = oa.d.x3(a0Var, c0Var);
            if (x32 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, x32.f14093b);
            }
        }
        return false;
    }
}
