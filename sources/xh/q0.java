package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w61;
public final class q0 implements Utilities.Callback {
    public final int f50192a;
    public final q1 f50193b;

    public q0(q1 q1Var, int i10) {
        this.f50192a = i10;
        this.f50193b = q1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50192a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                q1 q1Var = this.f50193b;
                if (q1Var.f50212s0 != intValue) {
                    q1Var.f50212s0 = intValue;
                    q1Var.f50205k0.g();
                    q1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                q1 q1Var2 = this.f50193b;
                if (q1Var2.getContext() != null && q1Var2.isShown()) {
                    ArrayList b10 = tg.s.b(1, list);
                    q1Var2.Z = b10;
                    List c10 = tg.s.c(b10);
                    q1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        q1Var2.U();
                        w61 w61Var = q1Var2.Y;
                        if (w61Var != null) {
                            w61Var.N(true);
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
