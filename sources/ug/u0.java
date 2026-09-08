package ug;
public final class u0 implements Runnable {
    public final int f47242a;
    public final a1 f47243b;

    public u0(a1 a1Var, int i10) {
        this.f47242a = i10;
        this.f47243b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f47242a) {
            case 0:
                this.f47243b.W(true);
                return;
            case 1:
                this.f47243b.b0(true, false);
                return;
            case 2:
                this.f47243b.R();
                return;
            case 3:
                this.f47243b.b0(true, false);
                return;
            case 4:
                this.f47243b.b0(true, false);
                return;
            case 5:
                this.f47243b.b0(true, false);
                return;
            case 6:
                a1 a1Var = this.f47243b;
                a1Var.f47075e0.clear();
                a1Var.f47076f0.clear();
                a1Var.dismiss();
                return;
            default:
                this.f47243b.dismiss();
                return;
        }
    }
}
