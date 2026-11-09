package zh;
public final class w0 implements Runnable {
    public final int f60589a;
    public final y0 f60590b;
    public final boolean f60591c;

    public w0(y0 y0Var, boolean z9, int i7) {
        this.f60589a = i7;
        this.f60590b = y0Var;
        this.f60591c = z9;
    }

    @Override
    public final void run() {
        switch (this.f60589a) {
            case 0:
                boolean z9 = this.f60591c;
                y0 y0Var = this.f60590b;
                if (!z9) {
                    y0Var.G.setVisibility(8);
                    return;
                } else {
                    y0Var.getClass();
                    return;
                }
            default:
                boolean z10 = this.f60591c;
                y0 y0Var2 = this.f60590b;
                if (!z10) {
                    y0Var2.f60629w.setVisibility(8);
                    return;
                } else {
                    y0Var2.getClass();
                    return;
                }
        }
    }
}
