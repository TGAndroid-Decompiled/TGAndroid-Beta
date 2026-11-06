package sg;

import a8.wa;
public final class g0 implements Runnable {
    public final int f54937a;
    public final j0 f54938b;
    public final wa f54939c;

    public g0(j0 j0Var, wa waVar, int i7) {
        this.f54937a = i7;
        this.f54938b = j0Var;
        this.f54939c = waVar;
    }

    @Override
    public final void run() {
        switch (this.f54937a) {
            case 0:
                this.f54938b.p(this.f54939c, true);
                return;
            default:
                j0 j0Var = this.f54938b;
                j0Var.f54973f.f(new g0(j0Var, this.f54939c, 0));
                return;
        }
    }
}
