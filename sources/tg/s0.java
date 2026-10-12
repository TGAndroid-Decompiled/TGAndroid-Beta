package tg;
public final class s0 implements Runnable {
    public final int f48617a;
    public final y0 f48618b;

    public s0(y0 y0Var, int i10) {
        this.f48617a = i10;
        this.f48618b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f48617a) {
            case 0:
                this.f48618b.X(true);
                return;
            case 1:
                this.f48618b.c0(true, false);
                return;
            case 2:
                this.f48618b.S();
                return;
            case 3:
                this.f48618b.c0(true, false);
                return;
            case 4:
                this.f48618b.c0(true, false);
                return;
            case 5:
                this.f48618b.c0(true, false);
                return;
            case 6:
                y0 y0Var = this.f48618b;
                y0Var.f48643e0.clear();
                y0Var.f48644f0.clear();
                y0Var.dismiss();
                return;
            default:
                this.f48618b.dismiss();
                return;
        }
    }
}
