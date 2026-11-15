package ri;

import c8.zc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.uj0;
public final class h {
    public final q f56101a;

    public h(q qVar) {
        this.f56101a = qVar;
    }

    public final void a() {
        int i7;
        q qVar = this.f56101a;
        ArrayList arrayList = qVar.f56122c;
        ArrayList arrayList2 = qVar.E;
        long j3 = qVar.f56137t;
        long j10 = q.G;
        if (j3 != j10) {
            qVar.f56137t = j10;
            qVar.f56124f = true;
            i7 = 32;
        } else {
            i7 = 0;
        }
        long j11 = j6.Dm + q6.f29535b;
        if (qVar.f56136s != j11) {
            qVar.f56136s = j11;
            i7 |= 16;
        }
        Iterator it = qVar.f56131n.iterator();
        while (it.hasNext()) {
            if (((uj0) it.next()).b0()) {
                qVar.f56126i++;
            }
        }
        if (i7 == 0) {
            return;
        }
        if (zc.a(i7, 16)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList2.get(i10);
                oVar.f56111a.a(oVar.f56112b.e());
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            if (zc.a(i7, 32)) {
                e eVar = pVar.f56114b;
                r rVar = q.F;
                if (!Objects.equals(eVar.f56096b, rVar)) {
                    eVar.f56096b = rVar;
                    eVar.g(rVar);
                }
            }
            if (zc.a(i7, 16)) {
                pVar.f56114b.updateColors();
            }
            pVar.f56114b.invalidateSelf();
            pVar.f56113a.invalidate();
            pVar.h = true;
        }
        qVar.f56138u |= i7;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ri.h.b():void");
    }
}
