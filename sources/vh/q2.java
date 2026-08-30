package vh;
public final class q2 implements Runnable {
    public final int f46084a;
    public final d1 f46085b;
    public final int f46086c;

    public q2(d1 d1Var, int i10, int i11) {
        this.f46084a = i11;
        this.f46085b = d1Var;
        this.f46086c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46084a) {
            case 0:
                d1 d1Var = this.f46085b;
                d1Var.r();
                d1Var.setSelection(Math.max(0, Math.min(this.f46086c, d1Var.length())));
                return;
            case 1:
                d1 d1Var2 = this.f46085b;
                d1Var2.r();
                d1Var2.setSelection(Math.max(0, Math.min(this.f46086c, d1Var2.length())));
                return;
            case 2:
                d1 d1Var3 = this.f46085b;
                d1Var3.r();
                d1Var3.setSelection(Math.max(0, Math.min(this.f46086c, d1Var3.length())));
                return;
            case 3:
                d1 d1Var4 = this.f46085b;
                d1Var4.r();
                d1Var4.setSelection(Math.min(this.f46086c, d1Var4.length()));
                return;
            default:
                d1 d1Var5 = this.f46085b;
                d1Var5.r();
                d1Var5.setSelection(Math.max(0, Math.min(this.f46086c, d1Var5.length())));
                return;
        }
    }
}
