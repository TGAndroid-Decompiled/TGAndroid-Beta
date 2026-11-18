package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.z01;
import v4.o;
public abstract class b extends bk0 {
    public final z01 f56591c = new z01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        z01 z01Var = this.f56591c;
        z01Var.f42707c = arrayList;
        z01Var.d = arrayList2;
        o.c(z01Var, true).c(this);
    }
}
