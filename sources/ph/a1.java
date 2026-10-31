package ph;
public final class a1 implements Runnable {
    public final int f44970a;
    public final c1 f44971b;
    public final boolean f44972c;

    public a1(c1 c1Var, boolean z10, int i10) {
        this.f44970a = i10;
        this.f44971b = c1Var;
        this.f44972c = z10;
    }

    @Override
    public final void run() {
        switch (this.f44970a) {
            case 0:
                boolean z10 = this.f44972c;
                c1 c1Var = this.f44971b;
                if (!z10) {
                    c1Var.G.setVisibility(8);
                    return;
                } else {
                    c1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f44972c;
                c1 c1Var2 = this.f44971b;
                if (!z11) {
                    c1Var2.f45011w.setVisibility(8);
                    return;
                } else {
                    c1Var2.getClass();
                    return;
                }
        }
    }
}
