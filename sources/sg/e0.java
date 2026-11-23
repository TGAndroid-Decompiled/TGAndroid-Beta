package sg;

import org.telegram.ui.Components.nd0;
public final class e0 implements Runnable {
    public final int f57308a;
    public final h0 f57309b;

    public e0(h0 h0Var, int i7) {
        this.f57308a = i7;
        this.f57309b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f57308a) {
            case 0:
                h0 h0Var = this.f57309b;
                h0Var.f57341c = null;
                nd0 nd0Var = h0Var.f57339a;
                if (nd0Var != null) {
                    nd0Var.p();
                    return;
                }
                return;
            default:
                this.f57309b.b();
                return;
        }
    }
}
