package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.x51;
public final class p0 implements Utilities.Callback {
    public final int f46088a;
    public final q1 f46089b;

    public p0(q1 q1Var, int i10) {
        this.f46088a = i10;
        this.f46089b = q1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46088a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                q1 q1Var = this.f46089b;
                if (q1Var.f46121s0 != intValue) {
                    q1Var.f46121s0 = intValue;
                    q1Var.f46114k0.g();
                    q1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                q1 q1Var2 = this.f46089b;
                if (q1Var2.getContext() != null && q1Var2.isShown()) {
                    ArrayList b10 = tg.t.b(1, list);
                    q1Var2.Z = b10;
                    List c10 = tg.t.c(b10);
                    q1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        q1Var2.W();
                        x51 x51Var = q1Var2.Y;
                        if (x51Var != null) {
                            x51Var.N(true);
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
