package vi;

import li.e3;
import org.telegram.ui.Components.b10;
public final class j0 implements Runnable {
    public final int f50506a;
    public final e3 f50507b;
    public final Exception f50508c;

    public j0(e3 e3Var, Exception exc, int i10) {
        this.f50506a = i10;
        this.f50507b = e3Var;
        this.f50508c = exc;
    }

    @Override
    public final void run() {
        switch (this.f50506a) {
            case 0:
                u0 u0Var = (u0) this.f50507b.f17209b;
                u0Var.f50643m.a("recording segment interrupted in state=".concat(b10.x(u0Var.Z)), this.f50508c);
                int i10 = u0Var.Z;
                if (i10 == 3) {
                    u0Var.q();
                    return;
                } else if (i10 == 2) {
                    u0Var.D = true;
                    return;
                } else {
                    return;
                }
            default:
                ((u0) this.f50507b.f17209b).h(this.f50508c);
                return;
        }
    }
}
