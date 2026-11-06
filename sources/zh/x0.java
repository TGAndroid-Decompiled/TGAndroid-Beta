package zh;
public final class x0 implements Runnable {
    public final int f60490a;
    public final z0 f60491b;
    public final boolean f60492c;

    public x0(z0 z0Var, boolean z9, int i7) {
        this.f60490a = i7;
        this.f60491b = z0Var;
        this.f60492c = z9;
    }

    @Override
    public final void run() {
        switch (this.f60490a) {
            case 0:
                boolean z9 = this.f60492c;
                z0 z0Var = this.f60491b;
                if (!z9) {
                    z0Var.G.setVisibility(8);
                    return;
                } else {
                    z0Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f60492c;
                z0 z0Var2 = this.f60491b;
                if (!z10) {
                    z0Var2.f60532w.setVisibility(8);
                    return;
                } else {
                    z0Var2.getClass();
                    return;
                }
        }
    }
}
