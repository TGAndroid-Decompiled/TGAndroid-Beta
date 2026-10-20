package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
public final class n0 implements Utilities.Callback {
    public final int f50412a;
    public final o1 f50413b;

    public n0(o1 o1Var, int i10) {
        this.f50412a = i10;
        this.f50413b = o1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50412a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                o1 o1Var = this.f50413b;
                if (o1Var.f50445s0 != intValue) {
                    o1Var.f50445s0 = intValue;
                    o1Var.f50438k0.g();
                    o1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                o1 o1Var2 = this.f50413b;
                if (o1Var2.getContext() != null && o1Var2.isShown()) {
                    ArrayList b10 = ug.r.b(1, list);
                    o1Var2.Z = b10;
                    List c10 = ug.r.c(b10);
                    o1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        o1Var2.X();
                        u61 u61Var = o1Var2.Y;
                        if (u61Var != null) {
                            u61Var.N(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
