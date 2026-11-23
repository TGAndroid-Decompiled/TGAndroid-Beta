package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.z01;
import v4.p;
public abstract class b extends dk0 {
    public final z01 f56714c = new z01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        z01 z01Var = this.f56714c;
        z01Var.f42615c = arrayList;
        z01Var.d = arrayList2;
        p.c(z01Var, true).c(this);
    }
}
