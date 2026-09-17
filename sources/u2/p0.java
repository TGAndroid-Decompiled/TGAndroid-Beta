package u2;
public final class p0 implements Runnable {
    public final int f43489a;
    public final u0 f43490b;

    public p0(u0 u0Var, int i10) {
        this.f43489a = i10;
        this.f43490b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f43489a) {
            case 0:
                this.f43490b.Z = true;
                return;
            case 1:
                this.f43490b.w();
                return;
            default:
                u0 u0Var = this.f43490b;
                if (!u0Var.f43523f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.v(u0Var);
                    return;
                }
                return;
        }
    }
}
