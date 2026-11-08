package zh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.l41;
public final class m0 implements c20 {
    public final int f60461a;
    public final g1 f60462b;

    public m0(g1 g1Var, int i7) {
        this.f60461a = i7;
        this.f60462b = g1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f60461a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                g1 g1Var = this.f60462b;
                if (g1Var.f60332j2 != intValue) {
                    g1Var.f60332j2 = intValue;
                    g1Var.f60325b2.g();
                    g1Var.Q1.O(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                g1 g1Var2 = this.f60462b;
                if (g1Var2.getContext() != null && !g1Var2.I) {
                    ArrayList b10 = wg.s.b(1, list);
                    g1Var2.R1 = b10;
                    List c10 = wg.s.c(b10);
                    g1Var2.R1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        g1Var2.f1();
                        l41 l41Var = g1Var2.Q1;
                        if (l41Var != null) {
                            l41Var.O(true);
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
