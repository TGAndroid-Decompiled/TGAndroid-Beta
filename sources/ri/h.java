package ri;

import c8.dd;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ck0;
public final class h {
    public final q f56675a;

    public h(q qVar) {
        this.f56675a = qVar;
    }

    public final void a() {
        int i7;
        q qVar = this.f56675a;
        ArrayList arrayList = qVar.f56696c;
        ArrayList arrayList2 = qVar.E;
        long j3 = qVar.f56711t;
        long j10 = q.G;
        if (j3 != j10) {
            qVar.f56711t = j10;
            qVar.f56698f = true;
            i7 = 32;
        } else {
            i7 = 0;
        }
        long j11 = n6.Dm + u6.f30085b;
        if (qVar.f56710s != j11) {
            qVar.f56710s = j11;
            i7 |= 16;
        }
        Iterator it = qVar.f56705n.iterator();
        while (it.hasNext()) {
            if (((ck0) it.next()).b0()) {
                qVar.f56700i++;
            }
        }
        if (i7 == 0) {
            return;
        }
        if (dd.a(i7, 16)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList2.get(i10);
                oVar.f56685a.a(oVar.f56686b.e());
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            if (dd.a(i7, 32)) {
                e eVar = pVar.f56688b;
                r rVar = q.F;
                if (!Objects.equals(eVar.f56670b, rVar)) {
                    eVar.f56670b = rVar;
                    eVar.g(rVar);
                }
            }
            if (dd.a(i7, 16)) {
                pVar.f56688b.updateColors();
            }
            pVar.f56688b.invalidateSelf();
            pVar.f56687a.invalidate();
            pVar.h = true;
        }
        qVar.f56712u |= i7;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ri.h.b():void");
    }
}
