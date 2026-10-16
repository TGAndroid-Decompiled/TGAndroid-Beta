package ug;
public final class t0 implements Runnable {
    public final int f46392a;
    public final z0 f46393b;

    public t0(z0 z0Var, int i10) {
        this.f46392a = i10;
        this.f46393b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f46392a) {
            case 0:
                this.f46393b.X(true);
                return;
            case 1:
                this.f46393b.c0(true, false);
                return;
            case 2:
                this.f46393b.S();
                return;
            case 3:
                this.f46393b.c0(true, false);
                return;
            case 4:
                this.f46393b.c0(true, false);
                return;
            case 5:
                this.f46393b.c0(true, false);
                return;
            case 6:
                z0 z0Var = this.f46393b;
                z0Var.f46417e0.clear();
                z0Var.f46418f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f46393b.dismiss();
                return;
        }
    }
}
