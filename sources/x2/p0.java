package x2;
public final class p0 implements Runnable {
    public final int f58317a;
    public final w0 f58318b;

    public p0(w0 w0Var, int i7) {
        this.f58317a = i7;
        this.f58318b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f58317a) {
            case 0:
                this.f58318b.f58375b0 = true;
                return;
            case 1:
                this.f58318b.u();
                return;
            default:
                w0 w0Var = this.f58318b;
                if (!w0Var.f58384h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.d(w0Var);
                    return;
                }
                return;
        }
    }
}
