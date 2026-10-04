package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
public final class q0 implements Utilities.Callback {
    public final int f50177a;
    public final q1 f50178b;

    public q0(q1 q1Var, int i10) {
        this.f50177a = i10;
        this.f50178b = q1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50177a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                q1 q1Var = this.f50178b;
                if (q1Var.f50197s0 != intValue) {
                    q1Var.f50197s0 = intValue;
                    q1Var.f50190k0.g();
                    q1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                q1 q1Var2 = this.f50178b;
                if (q1Var2.getContext() != null && q1Var2.isShown()) {
                    ArrayList b10 = tg.s.b(1, list);
                    q1Var2.Z = b10;
                    List c10 = tg.s.c(b10);
                    q1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        q1Var2.U();
                        u61 u61Var = q1Var2.Y;
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
