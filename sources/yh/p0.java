package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
public final class p0 implements Utilities.Callback {
    public final int f50480a;
    public final p1 f50481b;

    public p0(p1 p1Var, int i10) {
        this.f50480a = i10;
        this.f50481b = p1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50480a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.f50481b;
                if (p1Var.f50500s0 != intValue) {
                    p1Var.f50500s0 = intValue;
                    p1Var.f50493k0.g();
                    p1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.f50481b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = ug.t.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = ug.t.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.W();
                        v51 v51Var = p1Var2.Y;
                        if (v51Var != null) {
                            v51Var.N(true);
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
