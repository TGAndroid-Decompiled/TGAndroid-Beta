package ug;
public final class r0 implements Runnable {
    public final int f47773a;
    public final x0 f47774b;

    public r0(x0 x0Var, int i10) {
        this.f47773a = i10;
        this.f47774b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f47773a) {
            case 0:
                this.f47774b.X(true);
                return;
            case 1:
                this.f47774b.c0(true, false);
                return;
            case 2:
                this.f47774b.S();
                return;
            case 3:
                this.f47774b.c0(true, false);
                return;
            case 4:
                this.f47774b.c0(true, false);
                return;
            case 5:
                this.f47774b.c0(true, false);
                return;
            case 6:
                x0 x0Var = this.f47774b;
                x0Var.f47798e0.clear();
                x0Var.f47799f0.clear();
                x0Var.dismiss();
                return;
            default:
                this.f47774b.dismiss();
                return;
        }
    }
}
