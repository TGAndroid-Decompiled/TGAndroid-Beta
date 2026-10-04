package tg;
public final class t0 implements Runnable {
    public final int f47106a;
    public final z0 f47107b;

    public t0(z0 z0Var, int i10) {
        this.f47106a = i10;
        this.f47107b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f47106a) {
            case 0:
                this.f47107b.U(true);
                return;
            case 1:
                this.f47107b.b0(true, false);
                return;
            case 2:
                this.f47107b.P();
                return;
            case 3:
                this.f47107b.b0(true, false);
                return;
            case 4:
                this.f47107b.b0(true, false);
                return;
            case 5:
                this.f47107b.b0(true, false);
                return;
            case 6:
                z0 z0Var = this.f47107b;
                z0Var.f47132e0.clear();
                z0Var.f47133f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f47107b.dismiss();
                return;
        }
    }
}
