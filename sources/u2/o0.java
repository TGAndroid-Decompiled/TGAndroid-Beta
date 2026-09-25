package u2;
public final class o0 implements Runnable {
    public final int f43739a;
    public final u0 f43740b;

    public o0(u0 u0Var, int i10) {
        this.f43739a = i10;
        this.f43740b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f43739a) {
            case 0:
                this.f43740b.Z = true;
                return;
            case 1:
                this.f43740b.w();
                return;
            default:
                u0 u0Var = this.f43740b;
                if (!u0Var.f43786f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.m(u0Var);
                    return;
                }
                return;
        }
    }
}
