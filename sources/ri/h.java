package ri;

import c8.ed;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ek0;
public final class h {
    public final q f56798a;

    public h(q qVar) {
        this.f56798a = qVar;
    }

    public final void a() {
        int i7;
        q qVar = this.f56798a;
        ArrayList arrayList = qVar.f56819c;
        ArrayList arrayList2 = qVar.E;
        long j3 = qVar.f56834t;
        long j10 = q.G;
        if (j3 != j10) {
            qVar.f56834t = j10;
            qVar.f56821f = true;
            i7 = 32;
        } else {
            i7 = 0;
        }
        long j11 = n6.Dm + u6.f30164b;
        if (qVar.f56833s != j11) {
            qVar.f56833s = j11;
            i7 |= 16;
        }
        Iterator it = qVar.f56828n.iterator();
        while (it.hasNext()) {
            if (((ek0) it.next()).b0()) {
                qVar.f56823i++;
            }
        }
        if (i7 == 0) {
            return;
        }
        if (ed.a(i7, 16)) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList2.get(i10);
                oVar.f56808a.a(oVar.f56809b.j());
            }
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            if (ed.a(i7, 32)) {
                e eVar = pVar.f56811b;
                r rVar = q.F;
                if (!Objects.equals(eVar.f56793b, rVar)) {
                    eVar.f56793b = rVar;
                    eVar.g(rVar);
                }
            }
            if (ed.a(i7, 16)) {
                pVar.f56811b.updateColors();
            }
            pVar.f56811b.invalidateSelf();
            pVar.f56810a.invalidate();
            pVar.h = true;
        }
        qVar.f56835u |= i7;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ri.h.b():void");
    }
}
