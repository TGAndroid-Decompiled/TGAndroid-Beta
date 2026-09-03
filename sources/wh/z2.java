package wh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class z2 {
    public final r3 f50254a;

    public z2(r3 r3Var) {
        this.f50254a = r3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        r3 r3Var = this.f50254a;
        ArrayList arrayList = r3Var.f50024i3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && r3.w3(aVar)) {
            int O3 = r3Var.O3(indexOf);
            if (O3 >= arrayList.size()) {
                O3 = arrayList.size() - 1;
            }
            d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.d();
            }
            while (O3 >= indexOf) {
                arrayList.remove(O3);
                O3--;
            }
            a aVar3 = null;
            if (indexOf > 0) {
                aVar2 = (a) arrayList.get(indexOf - 1);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null && !aVar2.f49658i && !r3.w3(aVar2) && !r3.D3(aVar2.f49653b)) {
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
