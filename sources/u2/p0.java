package u2;
public final class p0 implements Runnable {
    public final int f49991a;
    public final w0 f49992b;

    public p0(w0 w0Var, int i10) {
        this.f49991a = i10;
        this.f49992b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f49991a) {
            case 0:
                this.f49992b.f50046b0 = true;
                return;
            case 1:
                this.f49992b.w();
                return;
            default:
                w0 w0Var = this.f49992b;
                if (!w0Var.f50054h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.r(w0Var);
                    return;
                }
                return;
        }
    }
}
