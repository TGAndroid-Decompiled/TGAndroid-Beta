package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;
public final class p0 implements Utilities.Callback {
    public final int f49053a;
    public final p1 f49054b;

    public p0(p1 p1Var, int i10) {
        this.f49053a = i10;
        this.f49054b = p1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f49053a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.f49054b;
                if (p1Var.f49073s0 != intValue) {
                    p1Var.f49073s0 = intValue;
                    p1Var.f49066k0.g();
                    p1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.f49054b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = ug.s.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = ug.s.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.X();
                        a71 a71Var = p1Var2.Y;
                        if (a71Var != null) {
                            a71Var.N(true);
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
