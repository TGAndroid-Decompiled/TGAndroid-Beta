package ph;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.p51;
public final class q0 implements q20 {
    public final int f45275a;
    public final l1 f45276b;

    public q0(l1 l1Var, int i10) {
        this.f45275a = i10;
        this.f45276b = l1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45275a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                l1 l1Var = this.f45276b;
                if (l1Var.f45202j2 != intValue) {
                    l1Var.f45202j2 = intValue;
                    l1Var.f45194b2.g();
                    l1Var.Q1.O(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                l1 l1Var2 = this.f45276b;
                if (l1Var2.getContext() != null && !l1Var2.I) {
                    ArrayList b10 = mg.k0.b(1, list);
                    l1Var2.R1 = b10;
                    List c10 = mg.k0.c(b10);
                    l1Var2.R1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        l1Var2.f1();
                        p51 p51Var = l1Var2.Q1;
                        if (p51Var != null) {
                            p51Var.O(true);
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
