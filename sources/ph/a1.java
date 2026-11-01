package ph;
public final class a1 implements Runnable {
    public final int f44981a;
    public final c1 f44982b;
    public final boolean f44983c;

    public a1(c1 c1Var, boolean z10, int i10) {
        this.f44981a = i10;
        this.f44982b = c1Var;
        this.f44983c = z10;
    }

    @Override
    public final void run() {
        switch (this.f44981a) {
            case 0:
                boolean z10 = this.f44983c;
                c1 c1Var = this.f44982b;
                if (!z10) {
                    c1Var.G.setVisibility(8);
                    return;
                } else {
                    c1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f44983c;
                c1 c1Var2 = this.f44982b;
                if (!z11) {
                    c1Var2.f45022w.setVisibility(8);
                    return;
                } else {
                    c1Var2.getClass();
                    return;
                }
        }
    }
}
