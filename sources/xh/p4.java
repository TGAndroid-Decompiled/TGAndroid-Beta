package xh;
public final class p4 implements Runnable {
    public final int f51578a;
    public final z4 f51579b;

    public p4(z4 z4Var, int i10) {
        this.f51578a = i10;
        this.f51579b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f51578a) {
            case 0:
                this.f51579b.Z(false);
                return;
            case 1:
                this.f51579b.Z(true);
                return;
            case 2:
                z4.V(this.f51579b);
                return;
            case 3:
                z4.U(this.f51579b);
                return;
            case 4:
                z4.S(this.f51579b);
                return;
            default:
                this.f51579b.dismiss();
                return;
        }
    }
}
