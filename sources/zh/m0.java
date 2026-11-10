package zh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.m41;
public final class m0 implements c20 {
    public final int f60471a;
    public final g1 f60472b;

    public m0(g1 g1Var, int i7) {
        this.f60471a = i7;
        this.f60472b = g1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f60471a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                g1 g1Var = this.f60472b;
                if (g1Var.f60347m2 != intValue) {
                    g1Var.f60347m2 = intValue;
                    g1Var.f60339e2.g();
                    g1Var.T1.O(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                g1 g1Var2 = this.f60472b;
                if (g1Var2.getContext() != null && !g1Var2.I) {
                    ArrayList b10 = wg.r.b(1, list);
                    g1Var2.U1 = b10;
                    List c10 = wg.r.c(b10);
                    g1Var2.U1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        g1Var2.f1();
                        m41 m41Var = g1Var2.T1;
                        if (m41Var != null) {
                            m41Var.O(true);
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
