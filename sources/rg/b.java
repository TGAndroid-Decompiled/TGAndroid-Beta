package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.tj0;
import v4.o;
public abstract class b extends tj0 {
    public final p01 f56017c = new p01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        p01 p01Var = this.f56017c;
        p01Var.f38141c = arrayList;
        p01Var.d = arrayList2;
        o.c(p01Var, true).c(this);
    }
}
