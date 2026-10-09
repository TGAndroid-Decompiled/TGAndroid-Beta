package xh;
public final class h1 implements Runnable {
    public final int f51261a;
    public final j1 f51262b;
    public final boolean f51263c;

    public h1(j1 j1Var, boolean z10, int i10) {
        this.f51261a = i10;
        this.f51262b = j1Var;
        this.f51263c = z10;
    }

    @Override
    public final void run() {
        switch (this.f51261a) {
            case 0:
                boolean z10 = this.f51263c;
                j1 j1Var = this.f51262b;
                if (!z10) {
                    j1Var.G.setVisibility(8);
                    return;
                } else {
                    j1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f51263c;
                j1 j1Var2 = this.f51262b;
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
