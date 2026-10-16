package yh;
public final class f1 implements Runnable {
    public final int f48855a;
    public final h1 f48856b;
    public final boolean f48857c;

    public f1(h1 h1Var, boolean z10, int i10) {
        this.f48855a = i10;
        this.f48856b = h1Var;
        this.f48857c = z10;
    }

    @Override
    public final void run() {
        switch (this.f48855a) {
            case 0:
                boolean z10 = this.f48857c;
                h1 h1Var = this.f48856b;
                if (!z10) {
                    h1Var.G.setVisibility(8);
                    return;
                } else {
                    h1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f48857c;
                h1 h1Var2 = this.f48856b;
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
