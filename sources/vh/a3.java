package vh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a3 {
    public final s3 f45875a;

    public a3(s3 s3Var) {
        this.f45875a = s3Var;
    }

    public final void a(a aVar) {
        a aVar2;
        s3 s3Var = this.f45875a;
        ArrayList arrayList = s3Var.f46217i3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && s3.w3(aVar)) {
            int O3 = s3Var.O3(indexOf);
            if (O3 >= arrayList.size()) {
                O3 = arrayList.size() - 1;
            }
            d2 d2Var = s3Var.G3;
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
            if (aVar2 != null && !aVar2.f45857i && !s3.w3(aVar2) && !s3.D3(aVar2.f45853b)) {
                aVar3 = aVar2;
            }
            if (arrayList.isEmpty()) {
                aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(aVar3);
            }
            s3Var.V2.N(false);
            d2 d2Var2 = s3Var.G3;
            if (d2Var2 != null) {
                d2Var2.h();
            }
            if (aVar3 != null) {
                s3Var.post(new k2(s3Var, aVar3, 22));
            }
        }
    }
}
