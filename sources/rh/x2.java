package rh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

public final class x2 {

    public final p3 f47583a;

    public x2(p3 p3Var) {
        this.f47583a = p3Var;
    }

    public final void a(a aVar) {
        p3 p3Var = this.f47583a;
        ArrayList arrayList = p3Var.f47348h3;
        int iIndexOf = arrayList.indexOf(aVar);
        if (iIndexOf < 0 || !p3.x3(aVar)) {
            return;
        }
        int iP3 = p3Var.P3(iIndexOf);
        if (iP3 >= arrayList.size()) {
            iP3 = arrayList.size() - 1;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        while (iP3 >= iIndexOf) {
            arrayList.remove(iP3);
            iP3--;
        }
        a aVar2 = null;
        a aVar3 = iIndexOf > 0 ? (a) arrayList.get(iIndexOf - 1) : null;
        if (aVar3 != null && !aVar3.f47033i && !p3.x3(aVar3) && !p3.E3(aVar3.f47028b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        p3Var.U2.N(false);
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        if (aVar2 != null) {
            p3Var.post(new i2(p3Var, aVar2, 22));
        }
    }
}
