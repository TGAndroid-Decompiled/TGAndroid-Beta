package tg;
public final class t0 implements Runnable {
    public final int f43491a;
    public final z0 f43492b;

    public t0(z0 z0Var, int i10) {
        this.f43491a = i10;
        this.f43492b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f43491a) {
            case 0:
                this.f43492b.W(true);
                return;
            case 1:
                this.f43492b.b0(true, false);
                return;
            case 2:
                this.f43492b.R();
                return;
            case 3:
                this.f43492b.b0(true, false);
                return;
            case 4:
                this.f43492b.b0(true, false);
                return;
            case 5:
                this.f43492b.b0(true, false);
                return;
            case 6:
                z0 z0Var = this.f43492b;
                z0Var.f43516e0.clear();
                z0Var.f43517f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f43492b.dismiss();
                return;
        }
    }
}
