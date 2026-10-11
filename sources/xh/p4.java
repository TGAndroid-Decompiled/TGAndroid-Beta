package xh;
public final class p4 implements Runnable {
    public final int f51544a;
    public final z4 f51545b;

    public p4(z4 z4Var, int i10) {
        this.f51544a = i10;
        this.f51545b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f51544a) {
            case 0:
                this.f51545b.Z(false);
                return;
            case 1:
                this.f51545b.Z(true);
                return;
            case 2:
                z4.V(this.f51545b);
                return;
            case 3:
                z4.U(this.f51545b);
                return;
            case 4:
                z4.S(this.f51545b);
                return;
            default:
                this.f51545b.dismiss();
                return;
        }
    }
}
