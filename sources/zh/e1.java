package zh;
public final class e1 implements Runnable {
    public final int f52961a;
    public final g1 f52962b;
    public final boolean f52963c;

    public e1(g1 g1Var, boolean z10, int i10) {
        this.f52961a = i10;
        this.f52962b = g1Var;
        this.f52963c = z10;
    }

    @Override
    public final void run() {
        switch (this.f52961a) {
            case 0:
                boolean z10 = this.f52963c;
                g1 g1Var = this.f52962b;
                if (!z10) {
                    g1Var.G.setVisibility(8);
                    return;
                } else {
                    g1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f52963c;
                g1 g1Var2 = this.f52962b;
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
