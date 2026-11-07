package zh;
public final class x0 implements Runnable {
    public final int f60495a;
    public final z0 f60496b;
    public final boolean f60497c;

    public x0(z0 z0Var, boolean z9, int i7) {
        this.f60495a = i7;
        this.f60496b = z0Var;
        this.f60497c = z9;
    }

    @Override
    public final void run() {
        switch (this.f60495a) {
            case 0:
                boolean z9 = this.f60497c;
                z0 z0Var = this.f60496b;
                if (!z9) {
                    z0Var.G.setVisibility(8);
                    return;
                } else {
                    z0Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f60497c;
                z0 z0Var2 = this.f60496b;
                if (!z10) {
                    z0Var2.f60537w.setVisibility(8);
                    return;
                } else {
                    z0Var2.getClass();
                    return;
                }
        }
    }
}
