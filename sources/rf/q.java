package rf;

import org.telegram.ui.kv;
import org.telegram.ui.y00;
public final class q implements Runnable {
    public final int f47335a;
    public final a0 f47336b;

    public q(a0 a0Var, int i10) {
        this.f47335a = i10;
        this.f47336b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f47335a) {
            case 0:
                a0 a0Var = this.f47336b;
                y00 y00Var = a0Var.f47166w0;
                if (y00Var != null) {
                    ((kv) y00Var).i(false, null, a0Var.f47163u0, a0Var.f47164v0);
                    return;
                }
                return;
            default:
                a0 a0Var2 = this.f47336b;
                a0Var2.getClass();
                a0Var2.f47140c = x.All;
                a0Var2.E.clear();
                int i10 = a0Var2.B0;
                if (i10 >= 0 && i10 < a0Var2.h()) {
                    a0Var2.m(a0Var2.B0);
                }
                a0Var2.Q();
                return;
        }
    }
}
