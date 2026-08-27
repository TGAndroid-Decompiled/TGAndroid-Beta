package rh;

public final class p2 implements Runnable {

    public final int f47331a;

    public final d1 f47332b;

    public final int f47333c;

    public p2(d1 d1Var, int i10, int i11) {
        this.f47331a = i11;
        this.f47332b = d1Var;
        this.f47333c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47331a) {
            case 0:
                d1 d1Var = this.f47332b;
                d1Var.r();
                d1Var.setSelection(Math.max(0, Math.min(this.f47333c, d1Var.length())));
                break;
            case 1:
                d1 d1Var2 = this.f47332b;
                d1Var2.r();
                d1Var2.setSelection(Math.max(0, Math.min(this.f47333c, d1Var2.length())));
                break;
            case 2:
                d1 d1Var3 = this.f47332b;
                d1Var3.r();
                d1Var3.setSelection(Math.max(0, Math.min(this.f47333c, d1Var3.length())));
                break;
            case 3:
                d1 d1Var4 = this.f47332b;
                d1Var4.r();
                d1Var4.setSelection(Math.min(this.f47333c, d1Var4.length()));
                break;
            default:
                d1 d1Var5 = this.f47332b;
                d1Var5.r();
                d1Var5.setSelection(Math.max(0, Math.min(this.f47333c, d1Var5.length())));
                break;
        }
    }
}
