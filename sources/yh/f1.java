package yh;
public final class f1 implements Runnable {
    public final int f50269a;
    public final h1 f50270b;
    public final boolean f50271c;

    public f1(h1 h1Var, boolean z10, int i10) {
        this.f50269a = i10;
        this.f50270b = h1Var;
        this.f50271c = z10;
    }

    @Override
    public final void run() {
        switch (this.f50269a) {
            case 0:
                boolean z10 = this.f50271c;
                h1 h1Var = this.f50270b;
                if (!z10) {
                    h1Var.G.setVisibility(8);
                    return;
                } else {
                    h1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f50271c;
                h1 h1Var2 = this.f50270b;
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
