package sg;

import a8.wa;
public final class g0 implements Runnable {
    public final int f54962a;
    public final j0 f54963b;
    public final wa f54964c;

    public g0(j0 j0Var, wa waVar, int i7) {
        this.f54962a = i7;
        this.f54963b = j0Var;
        this.f54964c = waVar;
    }

    @Override
    public final void run() {
        switch (this.f54962a) {
            case 0:
                this.f54963b.p(this.f54964c, true);
                return;
            default:
                j0 j0Var = this.f54963b;
                j0Var.f54998f.f(new g0(j0Var, this.f54964c, 0));
                return;
        }
    }
}
