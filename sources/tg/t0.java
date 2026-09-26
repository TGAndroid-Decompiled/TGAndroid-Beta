package tg;
public final class t0 implements Runnable {
    public final int f43489a;
    public final z0 f43490b;

    public t0(z0 z0Var, int i10) {
        this.f43489a = i10;
        this.f43490b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f43489a) {
            case 0:
                this.f43490b.W(true);
                return;
            case 1:
                this.f43490b.b0(true, false);
                return;
            case 2:
                this.f43490b.R();
                return;
            case 3:
                this.f43490b.b0(true, false);
                return;
            case 4:
                this.f43490b.b0(true, false);
                return;
            case 5:
                this.f43490b.b0(true, false);
                return;
            case 6:
                z0 z0Var = this.f43490b;
                z0Var.f43514e0.clear();
                z0Var.f43515f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f43490b.dismiss();
                return;
        }
    }
}
