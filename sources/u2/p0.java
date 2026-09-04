package u2;
public final class p0 implements Runnable {
    public final int f46783a;
    public final u0 f46784b;

    public p0(u0 u0Var, int i10) {
        this.f46783a = i10;
        this.f46784b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f46783a) {
            case 0:
                this.f46784b.Z = true;
                return;
            case 1:
                this.f46784b.x();
                return;
            default:
                u0 u0Var = this.f46784b;
                if (!u0Var.f46821f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.b(u0Var);
                    return;
                }
                return;
        }
    }
}
