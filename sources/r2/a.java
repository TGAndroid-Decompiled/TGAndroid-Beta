package r2;

import android.net.Uri;
import android.os.SystemClock;
import g9.g0;
import g9.g2;
import g9.t0;
import java.util.HashMap;
import org.telegram.ui.Cells.f1;
public final class a implements u {
    public final d f54068a;

    public a(d dVar) {
        this.f54068a = dVar;
    }

    @Override
    public final void a() {
        this.f54068a.f54086e.remove(this);
    }

    @Override
    public final boolean b(Uri uri, e5.u uVar, boolean z10) {
        c cVar;
        d dVar = this.f54068a;
        HashMap hashMap = dVar.d;
        if (dVar.H == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            w wVar = cVar2.f54080a;
            int size = wVar.f54232b.size();
            g2 it = t0.q(wVar.f54232b.values()).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                c cVar3 = (c) hashMap.get(uri2);
                if (cVar3 != null) {
                    b bVar = (b) f1.p(cVar3.f54081b, uri2, uri2);
                    bVar.getClass();
                    if (elapsedRealtime <= bVar.f54075r) {
                        i3++;
                    }
                }
            }
            int size2 = dVar.f54092x.size();
            g0 listIterator = dVar.f54092x.listIterator(0);
            int i10 = 0;
            while (listIterator.hasNext()) {
                if (dVar.e((w) listIterator.next(), elapsedRealtime)) {
                    i10++;
                }
            }
            a3.h hVar = new a3.h(size, i3, size2, i10);
            dVar.f54085c.getClass();
            a3.i D4 = kb.a.D4(hVar, uVar);
            if (D4 != null && (cVar = (c) hashMap.get(uri)) != null) {
                return c.c(cVar, uri, D4.f93b);
            }
        }
        return false;
    }
}
