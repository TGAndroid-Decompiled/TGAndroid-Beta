package ug;
public final class s0 implements Runnable {
    public final int f47756a;
    public final y0 f47757b;

    public s0(y0 y0Var, int i10) {
        this.f47756a = i10;
        this.f47757b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f47756a) {
            case 0:
                this.f47757b.X(true);
                return;
            case 1:
                this.f47757b.c0(true, false);
                return;
            case 2:
                this.f47757b.S();
                return;
            case 3:
                this.f47757b.c0(true, false);
                return;
            case 4:
                this.f47757b.c0(true, false);
                return;
            case 5:
                this.f47757b.c0(true, false);
                return;
            case 6:
                y0 y0Var = this.f47757b;
                y0Var.f47781e0.clear();
                y0Var.f47782f0.clear();
                y0Var.dismiss();
                return;
            default:
                this.f47757b.dismiss();
                return;
        }
    }
}
