package zh;
public final class w0 implements Runnable {
    public final int f60571a;
    public final y0 f60572b;
    public final boolean f60573c;

    public w0(y0 y0Var, boolean z9, int i7) {
        this.f60571a = i7;
        this.f60572b = y0Var;
        this.f60573c = z9;
    }

    @Override
    public final void run() {
        switch (this.f60571a) {
            case 0:
                boolean z9 = this.f60573c;
                y0 y0Var = this.f60572b;
                if (!z9) {
                    y0Var.G.setVisibility(8);
                    return;
                } else {
                    y0Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f60573c;
                y0 y0Var2 = this.f60572b;
                if (!z10) {
                    y0Var2.f60612w.setVisibility(8);
                    return;
                } else {
                    y0Var2.getClass();
                    return;
                }
        }
    }
}
