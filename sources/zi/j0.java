package zi;
public final class j0 implements Runnable {
    public final int f62160a;
    public final k0 f62161b;
    public final Exception f62162c;

    public j0(k0 k0Var, Exception exc, int i7) {
        this.f62160a = i7;
        this.f62161b = k0Var;
        this.f62162c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62160a) {
            case 0:
                u0 u0Var = (u0) this.f62161b.f62228a;
                u0Var.f62366m.a("recording segment interrupted in state=".concat(yi.i.e(u0Var.f62355a0)), this.f62162c);
                int i7 = u0Var.f62355a0;
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
                ((u0) this.f62161b.f62228a).h(this.f62162c);
                return;
        }
    }
}
