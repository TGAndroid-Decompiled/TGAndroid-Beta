package sg;

import a8.wa;
public final class g0 implements Runnable {
    public final int f55067a;
    public final j0 f55068b;
    public final wa f55069c;

    public g0(j0 j0Var, wa waVar, int i7) {
        this.f55067a = i7;
        this.f55068b = j0Var;
        this.f55069c = waVar;
    }

    @Override
    public final void run() {
        switch (this.f55067a) {
            case 0:
                this.f55068b.p(this.f55069c, true);
                return;
            default:
                j0 j0Var = this.f55068b;
                j0Var.f55103f.f(new g0(j0Var, this.f55069c, 0));
                return;
        }
    }
}
