package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.b0;
import e9.l0;
import e9.m2;
import e9.y0;
import java.util.HashMap;
import org.telegram.ui.Wallet.x5;
public final class a implements v {
    public final e f43940a;

    public a(e eVar) {
        this.f43940a = eVar;
    }

    @Override
    public final void a() {
        this.f43940a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, b0 b0Var, boolean z10) {
        d dVar;
        e eVar = this.f43940a;
        HashMap hashMap = eVar.d;
        if (eVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d dVar2 = (d) hashMap.get(uri);
            dVar2.getClass();
            x xVar = dVar2.f43953a;
            int size = xVar.f44095b.size();
            m2 it = y0.u(xVar.f44095b.values()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                d dVar3 = (d) hashMap.get(uri2);
                if (dVar3 != null) {
                    c cVar = (c) i0.a.i(dVar3.f43954b, uri2, uri2);
                    cVar.getClass();
                    if (elapsedRealtime <= cVar.f43949r) {
                        i10++;
                    }
                }
            }
            int size2 = eVar.f43963w.size();
            l0 listIterator = eVar.f43963w.listIterator(0);
            int i11 = 0;
            while (listIterator.hasNext()) {
                if (eVar.e((x) listIterator.next(), elapsedRealtime)) {
                    i11++;
                }
            }
            x5 x5Var = new x5(size, i10, size2, i11);
            eVar.f43958c.getClass();
            k4.d x32 = oa.d.x3(x5Var, b0Var);
            if (x32 != null && (dVar = (d) hashMap.get(uri)) != null) {
                return d.c(dVar, uri, x32.f14891b);
            }
        }
        return false;
    }
}
