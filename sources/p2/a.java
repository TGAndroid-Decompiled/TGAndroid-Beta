package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e9.l0;
import e9.m2;
import e9.y0;
import java.util.HashMap;
import si.z;
public final class a implements u {
    public final d f43920a;

    public a(d dVar) {
        this.f43920a = dVar;
    }

    @Override
    public final void a() {
        this.f43920a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        c cVar;
        d dVar = this.f43920a;
        HashMap hashMap = dVar.d;
        if (dVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.f43930a;
            int size = wVar.f44072b.size();
            m2 it = y0.u(wVar.f44072b.values()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) i2.d.i(cVar3.f43931b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.f43926r) {
                        i10++;
                    }
                }
            }
            int size2 = dVar.f43940w.size();
            l0 listIterator = dVar.f43940w.listIterator(0);
            int i11 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i11++;
                }
            }
            z zVar = new z(size, i10, size2, i11);
            dVar.f43935c.getClass();
            k4.d x32 = oa.d.x3(zVar, b0Var);
            if (x32 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, x32.f14896b);
            }
        }
        return false;
    }
}
