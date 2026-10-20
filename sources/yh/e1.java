package yh;
public final class e1 implements Runnable {
    public final int f50225a;
    public final g1 f50226b;
    public final boolean f50227c;

    public e1(g1 g1Var, boolean z10, int i10) {
        this.f50225a = i10;
        this.f50226b = g1Var;
        this.f50227c = z10;
    }

    @Override
    public final void run() {
        switch (this.f50225a) {
            case 0:
                boolean z10 = this.f50227c;
                g1 g1Var = this.f50226b;
                if (!z10) {
                    g1Var.G.setVisibility(8);
                    return;
                } else {
                    g1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f50227c;
                g1 g1Var2 = this.f50226b;
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
