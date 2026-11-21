package ri;

import c8.dd;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ek0;
public final class h {
    public final q f56716a;

    public h(q qVar) {
        this.f56716a = qVar;
    }

    public final void a() {
        int i7;
        q qVar = this.f56716a;
        ArrayList arrayList = qVar.f56737c;
        ArrayList arrayList2 = qVar.E;
        long j3 = qVar.f56752t;
        long j10 = q.G;
        if (j3 != j10) {
            qVar.f56752t = j10;
            qVar.f56739f = true;
            i7 = 32;
        } else {
            i7 = 0;
        }
        long j11 = m6.Dm + t6.f30066b;
        if (qVar.f56751s != j11) {
            qVar.f56751s = j11;
            i7 |= 16;
        }
        Iterator it = qVar.f56746n.iterator();
        while (it.hasNext()) {
            if (((ek0) it.next()).b0()) {
                qVar.f56741i++;
            }
        }
        if (i7 == 0) {
            return;
        }
        if (dd.a(i7, 16)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList2.get(i10);
                oVar.f56726a.a(oVar.f56727b.e());
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            if (dd.a(i7, 32)) {
                e eVar = pVar.f56729b;
                r rVar = q.F;
                if (!Objects.equals(eVar.f56711b, rVar)) {
                    eVar.f56711b = rVar;
                    eVar.g(rVar);
                }
            }
            if (dd.a(i7, 16)) {
                pVar.f56729b.updateColors();
            }
            pVar.f56729b.invalidateSelf();
            pVar.f56728a.invalidate();
            pVar.h = true;
        }
        qVar.f56753u |= i7;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ri.h.b():void");
    }
}
