package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h71;
public final class q0 implements Utilities.Callback {
    public final int f51693a;
    public final q1 f51694b;

    public q0(q1 q1Var, int i10) {
        this.f51693a = i10;
        this.f51694b = q1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51693a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                q1 q1Var = this.f51694b;
                if (q1Var.f51713s0 != intValue) {
                    q1Var.f51713s0 = intValue;
                    q1Var.f51706k0.g();
                    q1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                q1 q1Var2 = this.f51694b;
                if (q1Var2.getContext() != null && q1Var2.isShown()) {
                    ArrayList b10 = tg.r.b(1, list);
                    q1Var2.Z = b10;
                    List c10 = tg.r.c(b10);
                    q1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        q1Var2.X();
                        h71 h71Var = q1Var2.Y;
                        if (h71Var != null) {
                            h71Var.N(true);
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
