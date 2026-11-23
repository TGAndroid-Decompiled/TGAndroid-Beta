package zi;
public final class j0 implements Runnable {
    public final int f62125a;
    public final k0 f62126b;
    public final Exception f62127c;

    public j0(k0 k0Var, Exception exc, int i7) {
        this.f62125a = i7;
        this.f62126b = k0Var;
        this.f62127c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62125a) {
            case 0:
                u0 u0Var = (u0) this.f62126b.f62193a;
                u0Var.f62331m.a("recording segment interrupted in state=".concat(yi.i.e(u0Var.f62320a0)), this.f62127c);
                int i7 = u0Var.f62320a0;
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
                ((u0) this.f62126b.f62193a).h(this.f62127c);
                return;
        }
    }
}
