package x2;
public final class p0 implements Runnable {
    public final int f60236a;
    public final w0 f60237b;

    public p0(w0 w0Var, int i7) {
        this.f60236a = i7;
        this.f60237b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f60236a) {
            case 0:
                this.f60237b.f60299c0 = true;
                return;
            case 1:
                this.f60237b.x();
                return;
            default:
                w0 w0Var = this.f60237b;
                if (!w0Var.f60307i0) {
                    d0 d0Var = w0Var.J;
                    d0Var.getClass();
                    d0Var.c0(w0Var);
                    return;
                }
                return;
        }
    }
}
