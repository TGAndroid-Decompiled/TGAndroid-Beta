package xh;
public final class p4 implements Runnable {
    public final int f51455a;
    public final z4 f51456b;

    public p4(z4 z4Var, int i10) {
        this.f51455a = i10;
        this.f51456b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f51455a) {
            case 0:
                this.f51456b.Z(false);
                return;
            case 1:
                this.f51456b.Z(true);
                return;
            case 2:
                z4.V(this.f51456b);
                return;
            case 3:
                z4.U(this.f51456b);
                return;
            case 4:
                z4.S(this.f51456b);
                return;
            default:
                this.f51456b.dismiss();
                return;
        }
    }
}
