package tg;
public final class u0 implements Runnable {
    public final int f43227a;
    public final a1 f43228b;

    public u0(a1 a1Var, int i10) {
        this.f43227a = i10;
        this.f43228b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f43227a) {
            case 0:
                this.f43228b.W(true);
                return;
            case 1:
                this.f43228b.b0(true, false);
                return;
            case 2:
                this.f43228b.R();
                return;
            case 3:
                this.f43228b.b0(true, false);
                return;
            case 4:
                this.f43228b.b0(true, false);
                return;
            case 5:
                this.f43228b.b0(true, false);
                return;
            case 6:
                a1 a1Var = this.f43228b;
                a1Var.f43068e0.clear();
                a1Var.f43069f0.clear();
                a1Var.dismiss();
                return;
            default:
                this.f43228b.dismiss();
                return;
        }
    }
}
