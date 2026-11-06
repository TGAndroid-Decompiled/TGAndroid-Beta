package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.oj0;
import v4.o;
public abstract class b extends oj0 {
    public final l01 f54442c = new l01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        l01 l01Var = this.f54442c;
        l01Var.f35470c = arrayList;
        l01Var.d = arrayList2;
        o.c(l01Var, true).c(this);
    }
}
