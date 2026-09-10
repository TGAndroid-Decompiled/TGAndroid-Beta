package wh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j61;
public final class p0 implements Utilities.Callback {
    public final int f44284a;
    public final p1 f44285b;

    public p0(p1 p1Var, int i10) {
        this.f44284a = i10;
        this.f44285b = p1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44284a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.f44285b;
                if (p1Var.f44304s0 != intValue) {
                    p1Var.f44304s0 = intValue;
                    p1Var.f44297k0.g();
                    p1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.f44285b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = sg.s.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = sg.s.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.W();
                        j61 j61Var = p1Var2.Y;
                        if (j61Var != null) {
                            j61Var.N(true);
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
