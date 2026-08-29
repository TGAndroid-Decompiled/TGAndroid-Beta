package th;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class x2 {
    public final p3 f48881a;

    public x2(p3 p3Var) {
        this.f48881a = p3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        p3 p3Var = this.f48881a;
        ArrayList arrayList = p3Var.f48646h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && p3.x3(aVar)) {
            int P3 = p3Var.P3(indexOf);
            if (P3 >= arrayList.size()) {
                P3 = arrayList.size() - 1;
            }
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            while (P3 >= indexOf) {
                arrayList.remove(P3);
                P3--;
            }
            a aVar3 = null;
            if (indexOf > 0) {
                aVar2 = (a) arrayList.get(indexOf - 1);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && !aVar2.f48333i && !p3.x3(aVar2) && !p3.E3(aVar2.f48328b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            p3Var.U2.N(false);
            b2 b2Var2 = p3Var.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            if (aVar3 != null) {
                p3Var.post(new i2(p3Var, aVar3, 22));
            }
        }
    }
}
