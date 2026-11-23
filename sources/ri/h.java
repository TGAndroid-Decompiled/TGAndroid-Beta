package ri;

import c8.dd;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ek0;
public final class h {
    public final q f56720a;

    public h(q qVar) {
        this.f56720a = qVar;
    }

    public final void a() {
        int i7;
        q qVar = this.f56720a;
        ArrayList arrayList = qVar.f56741c;
        ArrayList arrayList2 = qVar.E;
        long j3 = qVar.f56756t;
        long j10 = q.G;
        if (j3 != j10) {
            qVar.f56756t = j10;
            qVar.f56743f = true;
            i7 = 32;
        } else {
            i7 = 0;
        }
        long j11 = m6.Dm + t6.f30069b;
        if (qVar.f56755s != j11) {
            qVar.f56755s = j11;
            i7 |= 16;
        }
        Iterator it = qVar.f56750n.iterator();
        while (it.hasNext()) {
            if (((ek0) it.next()).b0()) {
                qVar.f56745i++;
            }
        }
        if (i7 == 0) {
            return;
        }
        if (dd.a(i7, 16)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList2.get(i10);
                oVar.f56730a.a(oVar.f56731b.e());
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            if (dd.a(i7, 32)) {
                e eVar = pVar.f56733b;
                r rVar = q.F;
                if (!Objects.equals(eVar.f56715b, rVar)) {
                    eVar.f56715b = rVar;
                    eVar.g(rVar);
                }
            }
            if (dd.a(i7, 16)) {
                pVar.f56733b.updateColors();
            }
            pVar.f56733b.invalidateSelf();
            pVar.f56732a.invalidate();
            pVar.h = true;
        }
        qVar.f56757u |= i7;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ri.h.b():void");
    }
}
