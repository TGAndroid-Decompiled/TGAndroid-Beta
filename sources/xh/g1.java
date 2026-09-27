package xh;
public final class g1 implements Runnable {
    public final int f46220a;
    public final j1 f46221b;
    public final boolean f46222c;

    public g1(j1 j1Var, boolean z10, int i10) {
        this.f46220a = i10;
        this.f46221b = j1Var;
        this.f46222c = z10;
    }

    @Override
    public final void run() {
        switch (this.f46220a) {
            case 0:
                boolean z10 = this.f46222c;
                j1 j1Var = this.f46221b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f46222c;
                j1 j1Var2 = this.f46221b;
                if (!z11) {
                    j1Var2.v.setVisibility(8);
                    return;
                } else {
                    j1Var2.getClass();
                    return;
                }
        }
    }
}
