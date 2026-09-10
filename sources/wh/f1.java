package wh;
public final class f1 implements Runnable {
    public final int f44086a;
    public final h1 f44087b;
    public final boolean f44088c;

    public f1(h1 h1Var, boolean z10, int i10) {
        this.f44086a = i10;
        this.f44087b = h1Var;
        this.f44088c = z10;
    }

    @Override
    public final void run() {
        switch (this.f44086a) {
            case 0:
                boolean z10 = this.f44088c;
                h1 h1Var = this.f44087b;
                if (!z10) {
                    h1Var.G.setVisibility(8);
                    return;
                } else {
                    h1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f44088c;
                h1 h1Var2 = this.f44087b;
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
