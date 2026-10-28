package vg;
public final class t0 implements Runnable {
    public final int f50295a;
    public final z0 f50296b;

    public t0(z0 z0Var, int i10) {
        this.f50295a = i10;
        this.f50296b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f50295a) {
            case 0:
                this.f50296b.W(true);
                return;
            case 1:
                this.f50296b.b0(true, false);
                return;
            case 2:
                this.f50296b.R();
                return;
            case 3:
                this.f50296b.b0(true, false);
                return;
            case 4:
                this.f50296b.b0(true, false);
                return;
            case 5:
                this.f50296b.b0(true, false);
                return;
            case 6:
                z0 z0Var = this.f50296b;
                z0Var.f50320e0.clear();
                z0Var.f50321f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f50296b.dismiss();
                return;
        }
    }
}
