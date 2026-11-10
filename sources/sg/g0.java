package sg;

import a8.wa;
public final class g0 implements Runnable {
    public final int f55066a;
    public final j0 f55067b;
    public final wa f55068c;

    public g0(j0 j0Var, wa waVar, int i7) {
        this.f55066a = i7;
        this.f55067b = j0Var;
        this.f55068c = waVar;
    }

    @Override
    public final void run() {
        switch (this.f55066a) {
            case 0:
                this.f55067b.p(this.f55068c, true);
                return;
            default:
                j0 j0Var = this.f55067b;
                j0Var.f55102f.f(new g0(j0Var, this.f55068c, 0));
                return;
        }
    }
}
