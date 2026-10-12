package yh;
public final class f1 implements Runnable {
    public final int f48856a;
    public final h1 f48857b;
    public final boolean f48858c;

    public f1(h1 h1Var, boolean z10, int i10) {
        this.f48856a = i10;
        this.f48857b = h1Var;
        this.f48858c = z10;
    }

    @Override
    public final void run() {
        switch (this.f48856a) {
            case 0:
                boolean z10 = this.f48858c;
                h1 h1Var = this.f48857b;
                if (!z10) {
                    h1Var.G.setVisibility(8);
                    return;
                } else {
                    h1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f48858c;
                h1 h1Var2 = this.f48857b;
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
