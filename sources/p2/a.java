package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e9.l0;
import e9.m2;
import e9.y0;
import java.util.HashMap;
import org.telegram.ui.Wallet.z5;
public final class a implements v {
    public final e f43960a;

    public a(e eVar) {
        this.f43960a = eVar;
    }

    @Override
    public final void a() {
        this.f43960a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        d dVar;
        e eVar = this.f43960a;
        HashMap hashMap = eVar.d;
        if (eVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d dVar2 = (d) hashMap.get(uri);
            dVar2.getClass();
            x xVar = dVar2.f43973a;
            int size = xVar.f44115b.size();
            m2 it = y0.u(xVar.f44115b.values()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                d dVar3 = (d) hashMap.get(uri2);
                if (dVar3 != null) {
                    c cVar = (c) i2.d.i(dVar3.f43974b, uri2, uri2);
                    cVar.getClass();
                    if (elapsedRealtime <= cVar.f43969r) {
                        i10++;
                    }
                }
            }
            int size2 = eVar.f43983w.size();
            l0 listIterator = eVar.f43983w.listIterator(0);
            int i11 = 0;
            while (listIterator.hasNext()) {
                if (eVar.e((x) listIterator.next(), elapsedRealtime)) {
                    i11++;
                }
            }
            z5 z5Var = new z5(size, i10, size2, i11);
            eVar.f43978c.getClass();
            k4.d x32 = oa.d.x3(z5Var, b0Var);
            if (x32 != null && (dVar = (d) hashMap.get(uri)) != null) {
                return d.c(dVar, uri, x32.f14898b);
            }
        }
        return false;
    }
}
