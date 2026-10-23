package ug;
public final class r0 implements Runnable {
    public final int f48198a;
    public final x0 f48199b;

    public r0(x0 x0Var, int i10) {
        this.f48198a = i10;
        this.f48199b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f48198a) {
            case 0:
                this.f48199b.W(true);
                return;
            case 1:
                this.f48199b.b0(true, false);
                return;
            case 2:
                this.f48199b.R();
                return;
            case 3:
                this.f48199b.b0(true, false);
                return;
            case 4:
                this.f48199b.b0(true, false);
                return;
            case 5:
                this.f48199b.b0(true, false);
                return;
            case 6:
                x0 x0Var = this.f48199b;
                x0Var.f48223e0.clear();
                x0Var.f48224f0.clear();
                x0Var.dismiss();
                return;
            default:
                this.f48199b.dismiss();
                return;
        }
    }
}
