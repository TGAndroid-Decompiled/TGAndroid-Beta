package sg;

import a8.wa;
public final class g0 implements Runnable {
    public final int f55054a;
    public final j0 f55055b;
    public final wa f55056c;

    public g0(j0 j0Var, wa waVar, int i7) {
        this.f55054a = i7;
        this.f55055b = j0Var;
        this.f55056c = waVar;
    }

    @Override
    public final void run() {
        switch (this.f55054a) {
            case 0:
                this.f55055b.p(this.f55056c, true);
                return;
            default:
                j0 j0Var = this.f55055b;
                j0Var.f55090f.f(new g0(j0Var, this.f55056c, 0));
                return;
        }
    }
}
