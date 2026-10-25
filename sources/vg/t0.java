package vg;
public final class t0 implements Runnable {
    public final int f50257a;
    public final z0 f50258b;

    public t0(z0 z0Var, int i10) {
        this.f50257a = i10;
        this.f50258b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f50257a) {
            case 0:
                this.f50258b.W(true);
                return;
            case 1:
                this.f50258b.b0(true, false);
                return;
            case 2:
                this.f50258b.R();
                return;
            case 3:
                this.f50258b.b0(true, false);
                return;
            case 4:
                this.f50258b.b0(true, false);
                return;
            case 5:
                this.f50258b.b0(true, false);
                return;
            case 6:
                z0 z0Var = this.f50258b;
                z0Var.f50282e0.clear();
                z0Var.f50283f0.clear();
                z0Var.dismiss();
                return;
            default:
                this.f50258b.dismiss();
                return;
        }
    }
}
