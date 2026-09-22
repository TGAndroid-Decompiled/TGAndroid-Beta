package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m61;
public final class q0 implements Utilities.Callback {
    public final int f46394a;
    public final r1 f46395b;

    public q0(r1 r1Var, int i10) {
        this.f46394a = i10;
        this.f46395b = r1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46394a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                r1 r1Var = this.f46395b;
                if (r1Var.f46425s0 != intValue) {
                    r1Var.f46425s0 = intValue;
                    r1Var.f46418k0.g();
                    r1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                r1 r1Var2 = this.f46395b;
                if (r1Var2.getContext() != null && r1Var2.isShown()) {
                    ArrayList b10 = tg.s.b(1, list);
                    r1Var2.Z = b10;
                    List c10 = tg.s.c(b10);
                    r1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        r1Var2.W();
                        m61 m61Var = r1Var2.Y;
                        if (m61Var != null) {
                            m61Var.N(true);
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
