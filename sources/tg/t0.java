package tg;
public final class t0 implements Runnable {
    public final int f47113a;
    public final z0 f47114b;

    public t0(z0 z0Var, int i10) {
        this.f47113a = i10;
        this.f47114b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f47113a) {
            case 0:
                this.f47114b.U(true);
                return;
            case 1:
                this.f47114b.b0(true, false);
                return;
            case 2:
                this.f47114b.P();
                return;
            case 3:
                this.f47114b.b0(true, false);
                return;
            case 4:
                this.f47114b.b0(true, false);
                return;
            case 5:
                this.f47114b.b0(true, false);
                return;
            case 6:
                z0 z0Var = this.f47114b;
                z0Var.f47139e0.clear();
                z0Var.f47140f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f47114b.dismiss();
                return;
        }
    }
}
