package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.dk0;
import v4.o;
public abstract class b extends dk0 {
    public final a11 f56601c = new a11();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        a11 a11Var = this.f56601c;
        a11Var.f33237c = arrayList;
        a11Var.d = arrayList2;
        o.c(a11Var, true).c(this);
    }
}
