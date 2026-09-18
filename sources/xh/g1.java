package xh;
public final class g1 implements Runnable {
    public final int f46124a;
    public final j1 f46125b;
    public final boolean f46126c;

    public g1(j1 j1Var, boolean z10, int i10) {
        this.f46124a = i10;
        this.f46125b = j1Var;
        this.f46126c = z10;
    }

    @Override
    public final void run() {
        switch (this.f46124a) {
            case 0:
                boolean z10 = this.f46126c;
                j1 j1Var = this.f46125b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f46126c;
                j1 j1Var2 = this.f46125b;
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
