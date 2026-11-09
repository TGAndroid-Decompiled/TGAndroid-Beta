package wi;

import org.telegram.ui.Components.rt;
public final class j0 implements Runnable {
    public final int f58008a;
    public final rt f58009b;
    public final Exception f58010c;

    public j0(rt rtVar, Exception exc, int i7) {
        this.f58008a = i7;
        this.f58009b = rtVar;
        this.f58010c = exc;
    }

    @Override
    public final void run() {
        switch (this.f58008a) {
            case 0:
                t0 t0Var = (t0) this.f58009b.f37805b;
                t0Var.f58213m.a("recording segment interrupted in state=".concat(rf.b.u(t0Var.f58202a0)), this.f58010c);
                int i7 = t0Var.f58202a0;
                if (i7 == 3) {
                    t0Var.q();
                    return;
                } else if (i7 == 2) {
                    t0Var.D = true;
                    return;
                } else {
                    return;
                }
            default:
                ((t0) this.f58009b.f37805b).h(this.f58010c);
                return;
        }
    }
}
