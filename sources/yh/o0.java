package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s61;
public final class o0 implements Utilities.Callback {
    public final int f50466a;
    public final p1 f50467b;

    public o0(p1 p1Var, int i10) {
        this.f50466a = i10;
        this.f50467b = p1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50466a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.f50467b;
                if (p1Var.f50499s0 != intValue) {
                    p1Var.f50499s0 = intValue;
                    p1Var.f50492k0.g();
                    p1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.f50467b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = ug.r.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = ug.r.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.X();
                        s61 s61Var = p1Var2.Y;
                        if (s61Var != null) {
                            s61Var.N(true);
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
