package tg;
public final class t0 implements Runnable {
    public final int f47098a;
    public final z0 f47099b;

    public t0(z0 z0Var, int i10) {
        this.f47098a = i10;
        this.f47099b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f47098a) {
            case 0:
                this.f47099b.U(true);
                return;
            case 1:
                this.f47099b.b0(true, false);
                return;
            case 2:
                this.f47099b.P();
                return;
            case 3:
                this.f47099b.b0(true, false);
                return;
            case 4:
                this.f47099b.b0(true, false);
                return;
            case 5:
                this.f47099b.b0(true, false);
                return;
            case 6:
                z0 z0Var = this.f47099b;
                z0Var.f47124e0.clear();
                z0Var.f47125f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f47099b.dismiss();
                return;
        }
    }
}
