package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s61;
public final class o0 implements Utilities.Callback {
    public final int f50441a;
    public final p1 f50442b;

    public o0(p1 p1Var, int i10) {
        this.f50441a = i10;
        this.f50442b = p1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50441a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.f50442b;
                if (p1Var.f50474s0 != intValue) {
                    p1Var.f50474s0 = intValue;
                    p1Var.f50467k0.g();
                    p1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.f50442b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = ug.q.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = ug.q.c(b10);
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
