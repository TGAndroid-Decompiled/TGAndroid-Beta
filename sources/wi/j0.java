package wi;

import org.telegram.ui.Components.nh;
public final class j0 implements Runnable {
    public final int f57926a;
    public final nh f57927b;
    public final Exception f57928c;

    public j0(nh nhVar, Exception exc, int i3) {
        this.f57926a = i3;
        this.f57927b = nhVar;
        this.f57928c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57926a) {
            case 0:
                t0 t0Var = (t0) this.f57927b.f36540b;
                t0Var.f58064m.a("recording segment interrupted in state=".concat(t4.c.t(t0Var.Z)), this.f57928c);
                int i3 = t0Var.Z;
                if (i3 == 3) {
                    t0Var.q();
                    return;
                } else if (i3 == 2) {
                    t0Var.D = true;
                    return;
                } else {
                    return;
                }
            default:
                ((t0) this.f57927b.f36540b).h(this.f57928c);
                return;
        }
    }
}
