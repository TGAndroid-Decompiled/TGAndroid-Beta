package wi;

import org.telegram.ui.Components.rt;
public final class j0 implements Runnable {
    public final int f57998a;
    public final rt f57999b;
    public final Exception f58000c;

    public j0(rt rtVar, Exception exc, int i7) {
        this.f57998a = i7;
        this.f57999b = rtVar;
        this.f58000c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57998a) {
            case 0:
                t0 t0Var = (t0) this.f57999b.f37758b;
                t0Var.f58204m.a("recording segment interrupted in state=".concat(rf.b.u(t0Var.f58193a0)), this.f58000c);
                int i7 = t0Var.f58193a0;
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
                ((t0) this.f57999b.f37758b).h(this.f58000c);
                return;
        }
    }
}
