package xh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d71;
public final class r0 implements Utilities.Callback {
    public final int f51597a;
    public final r1 f51598b;

    public r0(r1 r1Var, int i10) {
        this.f51597a = i10;
        this.f51598b = r1Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51597a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                r1 r1Var = this.f51598b;
                if (r1Var.f51617s0 != intValue) {
                    r1Var.f51617s0 = intValue;
                    r1Var.f51610k0.g();
                    r1Var.Y.N(true);
                    return;
                }
                return;
            default:
                List list = (List) obj;
                r1 r1Var2 = this.f51598b;
                if (r1Var2.getContext() != null && r1Var2.isShown()) {
                    ArrayList b10 = tg.r.b(1, list);
                    r1Var2.Z = b10;
                    List c10 = tg.r.c(b10);
                    r1Var2.Z = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        r1Var2.X();
                        d71 d71Var = r1Var2.Y;
                        if (d71Var != null) {
                            d71Var.N(true);
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
