package zh;
public final class x0 implements Runnable {
    public final int f60465a;
    public final z0 f60466b;
    public final boolean f60467c;

    public x0(z0 z0Var, boolean z9, int i7) {
        this.f60465a = i7;
        this.f60466b = z0Var;
        this.f60467c = z9;
    }

    @Override
    public final void run() {
        switch (this.f60465a) {
            case 0:
                boolean z9 = this.f60467c;
                z0 z0Var = this.f60466b;
                if (!z9) {
                    z0Var.G.setVisibility(8);
                    return;
                } else {
                    z0Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f60467c;
                z0 z0Var2 = this.f60466b;
                if (!z10) {
                    z0Var2.f60507w.setVisibility(8);
                    return;
                } else {
                    z0Var2.getClass();
                    return;
                }
        }
    }
}
