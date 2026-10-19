package yh;
public final class e1 implements Runnable {
    public final int f50218a;
    public final g1 f50219b;
    public final boolean f50220c;

    public e1(g1 g1Var, boolean z10, int i10) {
        this.f50218a = i10;
        this.f50219b = g1Var;
        this.f50220c = z10;
    }

    @Override
    public final void run() {
        switch (this.f50218a) {
            case 0:
                boolean z10 = this.f50220c;
                g1 g1Var = this.f50219b;
                if (!z10) {
                    g1Var.G.setVisibility(8);
                    return;
                } else {
                    g1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f50220c;
                g1 g1Var2 = this.f50219b;
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
