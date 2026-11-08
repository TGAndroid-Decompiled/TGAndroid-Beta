package wi;

import org.telegram.ui.Components.rt;
public final class j0 implements Runnable {
    public final int f57997a;
    public final rt f57998b;
    public final Exception f57999c;

    public j0(rt rtVar, Exception exc, int i7) {
        this.f57997a = i7;
        this.f57998b = rtVar;
        this.f57999c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57997a) {
            case 0:
                t0 t0Var = (t0) this.f57998b.f37758b;
                t0Var.f58203m.a("recording segment interrupted in state=".concat(rf.b.u(t0Var.f58192a0)), this.f57999c);
                int i7 = t0Var.f58192a0;
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
                ((t0) this.f57998b.f37758b).h(this.f57999c);
                return;
        }
    }
}
