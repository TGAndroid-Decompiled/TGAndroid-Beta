package zi;
public final class j0 implements Runnable {
    public final int f62115a;
    public final k0 f62116b;
    public final Exception f62117c;

    public j0(k0 k0Var, Exception exc, int i7) {
        this.f62115a = i7;
        this.f62116b = k0Var;
        this.f62117c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62115a) {
            case 0:
                u0 u0Var = (u0) this.f62116b.f62183a;
                u0Var.f62321m.a("recording segment interrupted in state=".concat(yi.i.e(u0Var.f62310a0)), this.f62117c);
                int i7 = u0Var.f62310a0;
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
                ((u0) this.f62116b.f62183a).h(this.f62117c);
                return;
        }
    }
}
