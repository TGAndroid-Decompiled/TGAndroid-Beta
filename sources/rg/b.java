package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.pj0;
import v4.o;
public abstract class b extends pj0 {
    public final n01 f54546c = new n01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        n01 n01Var = this.f54546c;
        n01Var.f36188c = arrayList;
        n01Var.d = arrayList2;
        o.c(n01Var, true).c(this);
    }
}
