package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;
public final class n0 implements Utilities.Callback {
    public final int f50871a;
    public final o1 f50872b;

    public n0(o1 o1Var, int i10) {
        this.f50871a = i10;
        this.f50872b = o1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50871a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                o1 o1Var = this.f50872b;
                if (o1Var.f50905s0 != intValue) {
                    o1Var.f50905s0 = intValue;
                    o1Var.f50898k0.g();
                    o1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                o1 o1Var2 = this.f50872b;
                if (o1Var2.getContext() != null && o1Var2.isShown()) {
                    ArrayList b10 = ug.q.b(1, list);
                    o1Var2.Z = b10;
                    List c10 = ug.q.c(b10);
                    o1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        o1Var2.W();
                        a71 a71Var = o1Var2.Y;
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
