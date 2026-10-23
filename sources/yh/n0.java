package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b71;
public final class n0 implements Utilities.Callback {
    public final int f50872a;
    public final o1 f50873b;

    public n0(o1 o1Var, int i10) {
        this.f50872a = i10;
        this.f50873b = o1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50872a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                o1 o1Var = this.f50873b;
                if (o1Var.f50906s0 != intValue) {
                    o1Var.f50906s0 = intValue;
                    o1Var.f50899k0.g();
                    o1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                o1 o1Var2 = this.f50873b;
                if (o1Var2.getContext() != null && o1Var2.isShown()) {
                    ArrayList b10 = ug.q.b(1, list);
                    o1Var2.Z = b10;
                    List c10 = ug.q.c(b10);
                    o1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        o1Var2.W();
                        b71 b71Var = o1Var2.Y;
                        if (b71Var != null) {
                            b71Var.N(true);
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
