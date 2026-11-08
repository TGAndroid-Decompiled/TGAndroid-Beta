package sg;

import a8.wa;
public final class g0 implements Runnable {
    public final int f55053a;
    public final j0 f55054b;
    public final wa f55055c;

    public g0(j0 j0Var, wa waVar, int i7) {
        this.f55053a = i7;
        this.f55054b = j0Var;
        this.f55055c = waVar;
    }

    @Override
    public final void run() {
        switch (this.f55053a) {
            case 0:
                this.f55054b.p(this.f55055c, true);
                return;
            default:
                j0 j0Var = this.f55054b;
                j0Var.f55089f.f(new g0(j0Var, this.f55055c, 0));
                return;
        }
    }
}
