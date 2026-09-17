package yh;
public final class f1 implements Runnable {
    public final int f50270a;
    public final h1 f50271b;
    public final boolean f50272c;

    public f1(h1 h1Var, boolean z10, int i10) {
        this.f50270a = i10;
        this.f50271b = h1Var;
        this.f50272c = z10;
    }

    @Override
    public final void run() {
        switch (this.f50270a) {
            case 0:
                boolean z10 = this.f50272c;
                h1 h1Var = this.f50271b;
                if (!z10) {
                    h1Var.G.setVisibility(8);
                    return;
                } else {
                    h1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f50272c;
                h1 h1Var2 = this.f50271b;
                if (!z11) {
                    h1Var2.v.setVisibility(8);
                    return;
                } else {
                    h1Var2.getClass();
                    return;
                }
        }
    }
}
