package tg;
public final class t0 implements Runnable {
    public final int f48456a;
    public final z0 f48457b;

    public t0(z0 z0Var, int i10) {
        this.f48456a = i10;
        this.f48457b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f48456a) {
            case 0:
                this.f48457b.X(true);
                return;
            case 1:
                this.f48457b.c0(true, false);
                return;
            case 2:
                this.f48457b.S();
                return;
            case 3:
                this.f48457b.c0(true, false);
                return;
            case 4:
                this.f48457b.c0(true, false);
                return;
            case 5:
                this.f48457b.c0(true, false);
                return;
            case 6:
                z0 z0Var = this.f48457b;
                z0Var.f48482e0.clear();
                z0Var.f48483f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f48457b.dismiss();
                return;
        }
    }
}
