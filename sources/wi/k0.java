package wi;

import org.telegram.ui.Components.qt;
public final class k0 implements Runnable {
    public final int f57971a;
    public final qt f57972b;
    public final Exception f57973c;

    public k0(qt qtVar, Exception exc, int i7) {
        this.f57971a = i7;
        this.f57972b = qtVar;
        this.f57973c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57971a) {
            case 0:
                u0 u0Var = (u0) this.f57972b.f37389b;
                u0Var.f58114m.a("recording segment interrupted in state=".concat(rf.b.t(u0Var.f58103a0)), this.f57973c);
                int i7 = u0Var.f58103a0;
                if (i7 == 3) {
                    u0Var.q();
                    return;
                } else if (i7 == 2) {
                    u0Var.D = true;
                    return;
                } else {
                    return;
                }
            default:
                ((u0) this.f57972b.f37389b).h(this.f57973c);
                return;
        }
    }
}
