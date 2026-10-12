package yh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.z61;
public final class p0 implements Utilities.Callback {
    public final int f49054a;
    public final p1 f49055b;

    public p0(p1 p1Var, int i10) {
        this.f49054a = i10;
        this.f49055b = p1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f49054a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p1 p1Var = this.f49055b;
                if (p1Var.f49074s0 != intValue) {
                    p1Var.f49074s0 = intValue;
                    p1Var.f49067k0.g();
                    p1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                p1 p1Var2 = this.f49055b;
                if (p1Var2.getContext() != null && p1Var2.isShown()) {
                    ArrayList b10 = ug.s.b(1, list);
                    p1Var2.Z = b10;
                    List c10 = ug.s.c(b10);
                    p1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p1Var2.X();
                        z61 z61Var = p1Var2.Y;
                        if (z61Var != null) {
                            z61Var.N(true);
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
