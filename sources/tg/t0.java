package tg;
public final class t0 implements Runnable {
    public final int f48412a;
    public final z0 f48413b;

    public t0(z0 z0Var, int i10) {
        this.f48412a = i10;
        this.f48413b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f48412a) {
            case 0:
                this.f48413b.X(true);
                return;
            case 1:
                this.f48413b.c0(true, false);
                return;
            case 2:
                this.f48413b.S();
                return;
            case 3:
                this.f48413b.c0(true, false);
                return;
            case 4:
                this.f48413b.c0(true, false);
                return;
            case 5:
                this.f48413b.c0(true, false);
                return;
            case 6:
                z0 z0Var = this.f48413b;
                z0Var.f48438e0.clear();
                z0Var.f48439f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f48413b.dismiss();
                return;
        }
    }
}
