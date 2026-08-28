package qh;
public final class o2 implements Runnable {
    public final int f46556a;
    public final d1 f46557b;
    public final int f46558c;

    public o2(d1 d1Var, int i9, int i10) {
        this.f46556a = i10;
        this.f46557b = d1Var;
        this.f46558c = i9;
    }

    @Override
    public final void run() {
        switch (this.f46556a) {
            case 0:
                d1 d1Var = this.f46557b;
                d1Var.r();
                d1Var.setSelection(Math.max(0, Math.min(this.f46558c, d1Var.length())));
                return;
            case 1:
                d1 d1Var2 = this.f46557b;
                d1Var2.r();
                d1Var2.setSelection(Math.max(0, Math.min(this.f46558c, d1Var2.length())));
                return;
            case 2:
                d1 d1Var3 = this.f46557b;
                d1Var3.r();
                d1Var3.setSelection(Math.max(0, Math.min(this.f46558c, d1Var3.length())));
                return;
            case 3:
                d1 d1Var4 = this.f46557b;
                d1Var4.r();
                d1Var4.setSelection(Math.min(this.f46558c, d1Var4.length()));
                return;
            default:
                d1 d1Var5 = this.f46557b;
                d1Var5.r();
                d1Var5.setSelection(Math.max(0, Math.min(this.f46558c, d1Var5.length())));
                return;
        }
    }
}
