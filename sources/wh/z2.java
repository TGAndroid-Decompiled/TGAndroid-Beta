package wh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class z2 {
    public final r3 f50217a;

    public z2(r3 r3Var) {
        this.f50217a = r3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        r3 r3Var = this.f50217a;
        ArrayList arrayList = r3Var.f49987i3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && r3.x3(aVar)) {
            int P3 = r3Var.P3(indexOf);
            if (P3 >= arrayList.size()) {
                P3 = arrayList.size() - 1;
            }
            d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.d();
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
            if (aVar2 != null && !aVar2.f49621i && !r3.x3(aVar2) && !r3.E3(aVar2.f49616b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            r3Var.V2.N(false);
            d2 d2Var2 = r3Var.G3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            if (aVar3 != null) {
                r3Var.post(new k2(r3Var, aVar3, 22));
            }
        }
    }
}
