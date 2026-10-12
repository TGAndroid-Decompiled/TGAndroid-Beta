package tg;
public final class t0 implements Runnable {
    public final int f48649a;
    public final z0 f48650b;

    public t0(z0 z0Var, int i10) {
        this.f48649a = i10;
        this.f48650b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f48649a) {
            case 0:
                this.f48650b.X(true);
                return;
            case 1:
                this.f48650b.c0(true, false);
                return;
            case 2:
                this.f48650b.S();
                return;
            case 3:
                this.f48650b.c0(true, false);
                return;
            case 4:
                this.f48650b.c0(true, false);
                return;
            case 5:
                this.f48650b.c0(true, false);
                return;
            case 6:
                z0 z0Var = this.f48650b;
                z0Var.f48677e0.clear();
                z0Var.f48678f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f48650b.dismiss();
                return;
        }
    }
}
