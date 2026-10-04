package tg;
public final class t0 implements Runnable {
    public final int f47097a;
    public final z0 f47098b;

    public t0(z0 z0Var, int i10) {
        this.f47097a = i10;
        this.f47098b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f47097a) {
            case 0:
                this.f47098b.U(true);
                return;
            case 1:
                this.f47098b.b0(true, false);
                return;
            case 2:
                this.f47098b.P();
                return;
            case 3:
                this.f47098b.b0(true, false);
                return;
            case 4:
                this.f47098b.b0(true, false);
                return;
            case 5:
                this.f47098b.b0(true, false);
                return;
            case 6:
                z0 z0Var = this.f47098b;
                z0Var.f47123e0.clear();
                z0Var.f47124f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f47098b.dismiss();
                return;
        }
    }
}
