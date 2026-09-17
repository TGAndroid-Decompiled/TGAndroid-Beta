package ug;
public final class u0 implements Runnable {
    public final int f47243a;
    public final a1 f47244b;

    public u0(a1 a1Var, int i10) {
        this.f47243a = i10;
        this.f47244b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f47243a) {
            case 0:
                this.f47244b.W(true);
                return;
            case 1:
                this.f47244b.b0(true, false);
                return;
            case 2:
                this.f47244b.R();
                return;
            case 3:
                this.f47244b.b0(true, false);
                return;
            case 4:
                this.f47244b.b0(true, false);
                return;
            case 5:
                this.f47244b.b0(true, false);
                return;
            case 6:
                a1 a1Var = this.f47244b;
                a1Var.f47076e0.clear();
                a1Var.f47077f0.clear();
                a1Var.dismiss();
                return;
            default:
                this.f47244b.dismiss();
                return;
        }
    }
}
