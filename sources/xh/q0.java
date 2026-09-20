package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k61;
public final class q0 implements Utilities.Callback {
    public final int f46373a;
    public final r1 f46374b;

    public q0(r1 r1Var, int i10) {
        this.f46373a = i10;
        this.f46374b = r1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46373a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                r1 r1Var = this.f46374b;
                if (r1Var.f46404s0 != intValue) {
                    r1Var.f46404s0 = intValue;
                    r1Var.f46397k0.g();
                    r1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                r1 r1Var2 = this.f46374b;
                if (r1Var2.getContext() != null && r1Var2.isShown()) {
                    ArrayList b10 = tg.s.b(1, list);
                    r1Var2.Z = b10;
                    List c10 = tg.s.c(b10);
                    r1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        r1Var2.W();
                        k61 k61Var = r1Var2.Y;
                        if (k61Var != null) {
                            k61Var.N(true);
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
