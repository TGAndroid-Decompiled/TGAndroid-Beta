package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.dk0;
import v4.o;
public abstract class b extends dk0 {
    public final b11 f56632c = new b11();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        b11 b11Var = this.f56632c;
        b11Var.f33693c = arrayList;
        b11Var.d = arrayList2;
        o.c(b11Var, true).c(this);
    }
}
