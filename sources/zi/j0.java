package zi;
public final class j0 implements Runnable {
    public final int f62114a;
    public final k0 f62115b;
    public final Exception f62116c;

    public j0(k0 k0Var, Exception exc, int i7) {
        this.f62114a = i7;
        this.f62115b = k0Var;
        this.f62116c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62114a) {
            case 0:
                u0 u0Var = (u0) this.f62115b.f62182a;
                u0Var.f62320m.a("recording segment interrupted in state=".concat(yi.i.e(u0Var.f62309a0)), this.f62116c);
                int i7 = u0Var.f62309a0;
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
                ((u0) this.f62115b.f62182a).h(this.f62116c);
                return;
        }
    }
}
