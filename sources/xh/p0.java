package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;
public final class p0 implements Utilities.Callback {
    public final int f46056a;
    public final q1 f46057b;

    public p0(q1 q1Var, int i10) {
        this.f46056a = i10;
        this.f46057b = q1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46056a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                q1 q1Var = this.f46057b;
                if (q1Var.f46089s0 != intValue) {
                    q1Var.f46089s0 = intValue;
                    q1Var.f46082k0.g();
                    q1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                q1 q1Var2 = this.f46057b;
                if (q1Var2.getContext() != null && q1Var2.isShown()) {
                    ArrayList b10 = tg.t.b(1, list);
                    q1Var2.Z = b10;
                    List c10 = tg.t.c(b10);
                    q1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        q1Var2.W();
                        w51 w51Var = q1Var2.Y;
                        if (w51Var != null) {
                            w51Var.N(true);
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
