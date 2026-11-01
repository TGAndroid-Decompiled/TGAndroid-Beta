package ph;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.q51;
public final class q0 implements r20 {
    public final int f45286a;
    public final l1 f45287b;

    public q0(l1 l1Var, int i10) {
        this.f45286a = i10;
        this.f45287b = l1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45286a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                l1 l1Var = this.f45287b;
                if (l1Var.f45213j2 != intValue) {
                    l1Var.f45213j2 = intValue;
                    l1Var.f45205b2.g();
                    l1Var.Q1.O(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                l1 l1Var2 = this.f45287b;
                if (l1Var2.getContext() != null && !l1Var2.I) {
                    ArrayList b10 = mg.k0.b(1, list);
                    l1Var2.R1 = b10;
                    List c10 = mg.k0.c(b10);
                    l1Var2.R1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        l1Var2.f1();
                        q51 q51Var = l1Var2.Q1;
                        if (q51Var != null) {
                            q51Var.O(true);
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
