package zh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k71;
public final class n0 implements Utilities.Callback {
    public final int f53217a;
    public final p1 f53218b;

    public n0(p1 p1Var, int i10) {
        this.f53217a = i10;
        this.f53218b = p1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f53217a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.f53218b;
                if (p1Var.f53264s0 != intValue) {
                    p1Var.f53264s0 = intValue;
                    p1Var.f53257k0.g();
                    p1Var.Y.O(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.f53218b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = vg.s.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = vg.s.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.W();
                        k71 k71Var = p1Var2.Y;
                        if (k71Var != null) {
                            k71Var.O(true);
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
