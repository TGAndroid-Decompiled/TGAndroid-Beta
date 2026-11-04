package pi;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.tj0;
import x7.u;
public final class h {
    public final q f53583a;

    public h(q qVar) {
        this.f53583a = qVar;
    }

    public final void a() {
        int i3;
        q qVar = this.f53583a;
        ArrayList arrayList = qVar.f53604c;
        ArrayList arrayList2 = qVar.E;
        long j10 = qVar.f53619t;
        long j11 = q.G;
        if (j10 != j11) {
            qVar.f53619t = j11;
            qVar.f53606f = true;
            i3 = 32;
        } else {
            i3 = 0;
        }
        long j12 = k6.Am + r6.f28515b;
        if (qVar.f53618s != j12) {
            qVar.f53618s = j12;
            i3 |= 16;
        }
        Iterator it = qVar.f53613n.iterator();
        while (it.hasNext()) {
            if (((tj0) it.next()).b0()) {
                qVar.f53608i++;
            }
        }
        if (i3 == 0) {
            return;
        }
        if (u.a(i3, 16)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList2.get(i10);
                oVar.f53593a.a(oVar.f53594b.e());
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            if (u.a(i3, 32)) {
                e eVar = pVar.f53596b;
                r rVar = q.F;
                if (!Objects.equals(eVar.f53578b, rVar)) {
                    eVar.f53578b = rVar;
                    eVar.g(rVar);
                }
            }
            if (u.a(i3, 16)) {
                pVar.f53596b.updateColors();
            }
            pVar.f53596b.invalidateSelf();
            pVar.f53595a.invalidate();
            pVar.h = true;
        }
        qVar.f53620u |= i3;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: pi.h.b():void");
    }
}
