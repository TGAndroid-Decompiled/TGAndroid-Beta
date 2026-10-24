package ug;
public final class r0 implements Runnable {
    public final int f48197a;
    public final x0 f48198b;

    public r0(x0 x0Var, int i10) {
        this.f48197a = i10;
        this.f48198b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f48197a) {
            case 0:
                this.f48198b.W(true);
                return;
            case 1:
                this.f48198b.b0(true, false);
                return;
            case 2:
                this.f48198b.R();
                return;
            case 3:
                this.f48198b.b0(true, false);
                return;
            case 4:
                this.f48198b.b0(true, false);
                return;
            case 5:
                this.f48198b.b0(true, false);
                return;
            case 6:
                x0 x0Var = this.f48198b;
                x0Var.f48222e0.clear();
                x0Var.f48223f0.clear();
                x0Var.dismiss();
                return;
            default:
                this.f48198b.dismiss();
                return;
        }
    }
}
