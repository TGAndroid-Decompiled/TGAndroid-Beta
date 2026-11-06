package wi;

import org.telegram.ui.Components.qt;
public final class j0 implements Runnable {
    public final int f57967a;
    public final qt f57968b;
    public final Exception f57969c;

    public j0(qt qtVar, Exception exc, int i7) {
        this.f57967a = i7;
        this.f57968b = qtVar;
        this.f57969c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57967a) {
            case 0:
                t0 t0Var = (t0) this.f57968b.f37389b;
                t0Var.f58108m.a("recording segment interrupted in state=".concat(rf.b.t(t0Var.Z)), this.f57969c);
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
                ((t0) this.f57968b.f37389b).h(this.f57969c);
                return;
        }
    }
}
