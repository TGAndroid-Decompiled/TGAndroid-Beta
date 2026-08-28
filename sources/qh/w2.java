package qh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class w2 {
    public final o3 f46773a;

    public w2(o3 o3Var) {
        this.f46773a = o3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        o3 o3Var = this.f46773a;
        ArrayList arrayList = o3Var.f46573h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && o3.x3(aVar)) {
            int P3 = o3Var.P3(indexOf);
            if (P3 >= arrayList.size()) {
                P3 = arrayList.size() - 1;
            }
            b2 b2Var = o3Var.F3;
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
            if (aVar2 != null && !aVar2.f46274i && !o3.x3(aVar2) && !o3.E3(aVar2.f46269b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            o3Var.U2.N(false);
            b2 b2Var2 = o3Var.F3;
            if (b2Var2 != null) {
                b2Var2.h();
            }
            if (aVar3 != null) {
                o3Var.post(new i2(o3Var, aVar3, 22));
            }
        }
    }
}
