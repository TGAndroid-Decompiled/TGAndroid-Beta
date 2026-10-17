package yh;
public final class f1 implements Runnable {
    public final int f50254a;
    public final h1 f50255b;
    public final boolean f50256c;

    public f1(h1 h1Var, boolean z10, int i10) {
        this.f50254a = i10;
        this.f50255b = h1Var;
        this.f50256c = z10;
    }

    @Override
    public final void run() {
        switch (this.f50254a) {
            case 0:
                boolean z10 = this.f50256c;
                h1 h1Var = this.f50255b;
                if (!z10) {
                    h1Var.G.setVisibility(8);
                    return;
                } else {
                    h1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f50256c;
                h1 h1Var2 = this.f50255b;
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
