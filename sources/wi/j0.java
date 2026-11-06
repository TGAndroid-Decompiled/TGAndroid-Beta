package wi;

import org.telegram.ui.Components.qt;
public final class j0 implements Runnable {
    public final int f57943a;
    public final qt f57944b;
    public final Exception f57945c;

    public j0(qt qtVar, Exception exc, int i7) {
        this.f57943a = i7;
        this.f57944b = qtVar;
        this.f57945c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57943a) {
            case 0:
                t0 t0Var = (t0) this.f57944b.f37504b;
                t0Var.f58084m.a("recording segment interrupted in state=".concat(rf.b.t(t0Var.Z)), this.f57945c);
                int i7 = t0Var.Z;
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
                ((t0) this.f57944b.f37504b).h(this.f57945c);
                return;
        }
    }
}
