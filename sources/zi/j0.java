package zi;
public final class j0 implements Runnable {
    public final int f62156a;
    public final k0 f62157b;
    public final Exception f62158c;

    public j0(k0 k0Var, Exception exc, int i7) {
        this.f62156a = i7;
        this.f62157b = k0Var;
        this.f62158c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62156a) {
            case 0:
                u0 u0Var = (u0) this.f62157b.f62224a;
                u0Var.f62362m.a("recording segment interrupted in state=".concat(yi.i.e(u0Var.f62351a0)), this.f62158c);
                int i7 = u0Var.f62351a0;
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
                ((u0) this.f62157b.f62224a).h(this.f62158c);
                return;
        }
    }
}
