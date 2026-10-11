package tg;
public final class s0 implements Runnable {
    public final int f48510a;
    public final y0 f48511b;

    public s0(y0 y0Var, int i10) {
        this.f48510a = i10;
        this.f48511b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f48510a) {
            case 0:
                this.f48511b.X(true);
                return;
            case 1:
                this.f48511b.c0(true, false);
                return;
            case 2:
                this.f48511b.S();
                return;
            case 3:
                this.f48511b.c0(true, false);
                return;
            case 4:
                this.f48511b.c0(true, false);
                return;
            case 5:
                this.f48511b.c0(true, false);
                return;
            case 6:
                y0 y0Var = this.f48511b;
                y0Var.f48536e0.clear();
                y0Var.f48537f0.clear();
                y0Var.dismiss();
                return;
            default:
                this.f48511b.dismiss();
                return;
        }
    }
}
