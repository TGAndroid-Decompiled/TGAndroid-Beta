package tg;
public final class t0 implements Runnable {
    public final int f43536a;
    public final z0 f43537b;

    public t0(z0 z0Var, int i10) {
        this.f43536a = i10;
        this.f43537b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f43536a) {
            case 0:
                this.f43537b.W(true);
                return;
            case 1:
                this.f43537b.b0(true, false);
                return;
            case 2:
                this.f43537b.R();
                return;
            case 3:
                this.f43537b.b0(true, false);
                return;
            case 4:
                this.f43537b.b0(true, false);
                return;
            case 5:
                this.f43537b.b0(true, false);
                return;
            case 6:
                z0 z0Var = this.f43537b;
                z0Var.f43561e0.clear();
                z0Var.f43562f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f43537b.dismiss();
                return;
        }
    }
}
