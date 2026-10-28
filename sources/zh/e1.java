package zh;
public final class e1 implements Runnable {
    public final int f53019a;
    public final g1 f53020b;
    public final boolean f53021c;

    public e1(g1 g1Var, boolean z10, int i10) {
        this.f53019a = i10;
        this.f53020b = g1Var;
        this.f53021c = z10;
    }

    @Override
    public final void run() {
        switch (this.f53019a) {
            case 0:
                boolean z10 = this.f53021c;
                g1 g1Var = this.f53020b;
                if (!z10) {
                    g1Var.G.setVisibility(8);
                    return;
                } else {
                    g1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f53021c;
                g1 g1Var2 = this.f53020b;
                if (!z11) {
                    g1Var2.v.setVisibility(8);
                    return;
                } else {
                    g1Var2.getClass();
                    return;
                }
        }
    }
}
