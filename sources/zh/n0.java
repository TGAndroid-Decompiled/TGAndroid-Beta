package zh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j71;
public final class n0 implements Utilities.Callback {
    public final int f53156a;
    public final p1 f53157b;

    public n0(p1 p1Var, int i10) {
        this.f53156a = i10;
        this.f53157b = p1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f53156a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.f53157b;
                if (p1Var.f53203s0 != intValue) {
                    p1Var.f53203s0 = intValue;
                    p1Var.f53196k0.g();
                    p1Var.Y.O(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.f53157b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = vg.s.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = vg.s.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.W();
                        j71 j71Var = p1Var2.Y;
                        if (j71Var != null) {
                            j71Var.O(true);
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
