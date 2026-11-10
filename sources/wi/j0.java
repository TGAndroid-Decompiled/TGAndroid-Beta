package wi;

import org.telegram.ui.Components.qt;
public final class j0 implements Runnable {
    public final int f58012a;
    public final qt f58013b;
    public final Exception f58014c;

    public j0(qt qtVar, Exception exc, int i7) {
        this.f58012a = i7;
        this.f58013b = qtVar;
        this.f58014c = exc;
    }

    @Override
    public final void run() {
        switch (this.f58012a) {
            case 0:
                t0 t0Var = (t0) this.f58013b.f37395b;
                t0Var.f58217m.a("recording segment interrupted in state=".concat(rf.b.u(t0Var.f58206a0)), this.f58014c);
                int i7 = t0Var.f58206a0;
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
                ((t0) this.f58013b.f37395b).h(this.f58014c);
                return;
        }
    }
}
