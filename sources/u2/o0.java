package u2;
public final class o0 implements Runnable {
    public final int f43386a;
    public final t0 f43387b;

    public o0(t0 t0Var, int i10) {
        this.f43386a = i10;
        this.f43387b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f43386a) {
            case 0:
                this.f43387b.Z = true;
                return;
            case 1:
                this.f43387b.w();
                return;
            default:
                t0 t0Var = this.f43387b;
                if (!t0Var.f43425f0) {
                    c0 c0Var = t0Var.I;
                    c0Var.getClass();
                    c0Var.v(t0Var);
                    return;
                }
                return;
        }
    }
}
