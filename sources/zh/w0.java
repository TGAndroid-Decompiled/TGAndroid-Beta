package zh;
public final class w0 implements Runnable {
    public final int f60570a;
    public final y0 f60571b;
    public final boolean f60572c;

    public w0(y0 y0Var, boolean z9, int i7) {
        this.f60570a = i7;
        this.f60571b = y0Var;
        this.f60572c = z9;
    }

    @Override
    public final void run() {
        switch (this.f60570a) {
            case 0:
                boolean z9 = this.f60572c;
                y0 y0Var = this.f60571b;
                if (!z9) {
                    y0Var.G.setVisibility(8);
                    return;
                } else {
                    y0Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f60572c;
                y0 y0Var2 = this.f60571b;
                if (!z10) {
                    y0Var2.f60611w.setVisibility(8);
                    return;
                } else {
                    y0Var2.getClass();
                    return;
                }
        }
    }
}
