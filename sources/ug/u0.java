package ug;
public final class u0 implements Runnable {
    public final int f47215a;
    public final a1 f47216b;

    public u0(a1 a1Var, int i10) {
        this.f47215a = i10;
        this.f47216b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f47215a) {
            case 0:
                this.f47216b.W(true);
                return;
            case 1:
                this.f47216b.b0(true, false);
                return;
            case 2:
                this.f47216b.R();
                return;
            case 3:
                this.f47216b.b0(true, false);
                return;
            case 4:
                this.f47216b.b0(true, false);
                return;
            case 5:
                this.f47216b.b0(true, false);
                return;
            case 6:
                a1 a1Var = this.f47216b;
                a1Var.f47048e0.clear();
                a1Var.f47049f0.clear();
                a1Var.dismiss();
                return;
            default:
                this.f47216b.dismiss();
                return;
        }
    }
}
