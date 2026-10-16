package p2;

import android.net.Uri;
import android.os.SystemClock;
import c5.c0;
import e9.l0;
import e9.m2;
import e9.y0;
import java.util.HashMap;
import org.telegram.ui.Wallet.k5;
public final class a implements u {
    public final d f42533a;

    public a(d dVar) {
        this.f42533a = dVar;
    }

    @Override
    public final void a() {
        this.f42533a.e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, c0 c0Var, boolean z10) {
        c cVar;
        d dVar = this.f42533a;
        HashMap hashMap = dVar.d;
        if (dVar.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.f42543a;
            int size = wVar.f42685b.size();
            m2 it = y0.u(wVar.f42685b.values()).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) i2.d.i(cVar3.f42544b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.f42539r) {
                        i10++;
                    }
                }
            }
            int size2 = dVar.f42553w.size();
            l0 listIterator = dVar.f42553w.listIterator(0);
            int i11 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i11++;
                }
            }
            k5 k5Var = new k5(size, i10, size2, i11);
            dVar.f42548c.getClass();
            k4.d x32 = oa.d.x3(k5Var, c0Var);
            if (x32 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, x32.f14096b);
            }
        }
        return false;
    }
}
