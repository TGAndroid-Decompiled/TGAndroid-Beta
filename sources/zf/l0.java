package zf;

import java.util.ArrayList;
import org.telegram.messenger.si;
import org.telegram.ui.Cells.g2;
import org.telegram.ui.Components.t90;
public final class l0 implements si, g2 {
    public final x0 f55578a;

    public l0(x0 x0Var) {
        this.f55578a = x0Var;
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        boolean z10;
        x0 x0Var = this.f55578a;
        x0Var.N = arrayList;
        x0Var.I = null;
        x0Var.A0 = null;
        x0Var.f55693y = null;
        x0Var.D = null;
        x0Var.J = null;
        x0Var.Q = null;
        x0Var.M = null;
        x0Var.K = null;
        x0Var.P = null;
        x0Var.f();
        t90 t90Var = x0Var.V;
        ArrayList arrayList2 = x0Var.N;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        t90Var.a(z10);
    }
}
