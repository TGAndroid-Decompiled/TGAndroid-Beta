package u2;
public final class o0 implements Runnable {
    public final int f48671a;
    public final u0 f48672b;

    public o0(u0 u0Var, int i10) {
        this.f48671a = i10;
        this.f48672b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f48671a) {
            case 0:
                this.f48672b.Z = true;
                return;
            case 1:
                this.f48672b.t();
                return;
            default:
                u0 u0Var = this.f48672b;
                if (!u0Var.f48723f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.D(u0Var);
                    return;
                }
                return;
        }
    }
}
