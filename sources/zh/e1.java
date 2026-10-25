package zh;
public final class e1 implements Runnable {
    public final int f52958a;
    public final g1 f52959b;
    public final boolean f52960c;

    public e1(g1 g1Var, boolean z10, int i10) {
        this.f52958a = i10;
        this.f52959b = g1Var;
        this.f52960c = z10;
    }

    @Override
    public final void run() {
        switch (this.f52958a) {
            case 0:
                boolean z10 = this.f52960c;
                g1 g1Var = this.f52959b;
                if (!z10) {
                    g1Var.G.setVisibility(8);
                    return;
                } else {
                    g1Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f52960c;
                g1 g1Var2 = this.f52959b;
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
