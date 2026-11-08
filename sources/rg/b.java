package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.oj0;
import v4.o;
public abstract class b extends oj0 {
    public final m01 f54533c = new m01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        m01 m01Var = this.f54533c;
        m01Var.f35837c = arrayList;
        m01Var.d = arrayList2;
        o.c(m01Var, true).c(this);
    }
}
