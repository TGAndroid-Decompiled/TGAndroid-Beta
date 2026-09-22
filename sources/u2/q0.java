package u2;
public final class q0 implements Runnable {
    public final int f43789a;
    public final v0 f43790b;

    public q0(v0 v0Var, int i10) {
        this.f43789a = i10;
        this.f43790b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f43789a) {
            case 0:
                this.f43790b.Z = true;
                return;
            case 1:
                this.f43790b.w();
                return;
            default:
                v0 v0Var = this.f43790b;
                if (!v0Var.f43826f0) {
                    c0 c0Var = v0Var.I;
                    c0Var.getClass();
                    c0Var.l(v0Var);
                    return;
                }
                return;
        }
    }
}
