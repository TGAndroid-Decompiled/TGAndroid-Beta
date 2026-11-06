package zh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.l41;
public final class n0 implements c20 {
    public final int f60379a;
    public final h1 f60380b;

    public n0(h1 h1Var, int i7) {
        this.f60379a = i7;
        this.f60380b = h1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f60379a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                h1 h1Var = this.f60380b;
                if (h1Var.f60250j2 != intValue) {
                    h1Var.f60250j2 = intValue;
                    h1Var.f60243b2.g();
                    h1Var.Q1.O(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                h1 h1Var2 = this.f60380b;
                if (h1Var2.getContext() != null && !h1Var2.I) {
                    ArrayList b10 = wg.s.b(1, list);
                    h1Var2.R1 = b10;
                    List c10 = wg.s.c(b10);
                    h1Var2.R1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        h1Var2.f1();
                        l41 l41Var = h1Var2.Q1;
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
