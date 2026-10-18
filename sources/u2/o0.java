package u2;
public final class o0 implements Runnable {
    public final int f47444a;
    public final v0 f47445b;

    public o0(v0 v0Var, int i10) {
        this.f47444a = i10;
        this.f47445b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f47444a) {
            case 0:
                this.f47445b.f47498b0 = true;
                return;
            case 1:
                this.f47445b.w();
                return;
            default:
                v0 v0Var = this.f47445b;
                if (!v0Var.f47506h0) {
                    c0 c0Var = v0Var.I;
                    c0Var.getClass();
                    c0Var.v(v0Var);
                    return;
                }
                return;
        }
    }
}
