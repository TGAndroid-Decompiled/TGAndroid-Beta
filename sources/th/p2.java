package th;
public final class p2 implements Runnable {
    public final int f48630a;
    public final d1 f48631b;
    public final int f48632c;

    public p2(d1 d1Var, int i10, int i11) {
        this.f48630a = i11;
        this.f48631b = d1Var;
        this.f48632c = i10;
    }

    @Override
    public final void run() {
        switch (this.f48630a) {
            case 0:
                d1 d1Var = this.f48631b;
                d1Var.r();
                d1Var.setSelection(Math.max(0, Math.min(this.f48632c, d1Var.length())));
                return;
            case 1:
                d1 d1Var2 = this.f48631b;
                d1Var2.r();
                d1Var2.setSelection(Math.max(0, Math.min(this.f48632c, d1Var2.length())));
                return;
            case 2:
                d1 d1Var3 = this.f48631b;
                d1Var3.r();
                d1Var3.setSelection(Math.max(0, Math.min(this.f48632c, d1Var3.length())));
                return;
            case 3:
                d1 d1Var4 = this.f48631b;
                d1Var4.r();
                d1Var4.setSelection(Math.min(this.f48632c, d1Var4.length()));
                return;
            default:
                d1 d1Var5 = this.f48631b;
                d1Var5.r();
                d1Var5.setSelection(Math.max(0, Math.min(this.f48632c, d1Var5.length())));
                return;
        }
    }
}
