package ug;
public final class t0 implements Runnable {
    public final int f46393a;
    public final z0 f46394b;

    public t0(z0 z0Var, int i10) {
        this.f46393a = i10;
        this.f46394b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f46393a) {
            case 0:
                this.f46394b.X(true);
                return;
            case 1:
                this.f46394b.c0(true, false);
                return;
            case 2:
                this.f46394b.S();
                return;
            case 3:
                this.f46394b.c0(true, false);
                return;
            case 4:
                this.f46394b.c0(true, false);
                return;
            case 5:
                this.f46394b.c0(true, false);
                return;
            case 6:
                z0 z0Var = this.f46394b;
                z0Var.f46418e0.clear();
                z0Var.f46419f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f46394b.dismiss();
                return;
        }
    }
}
