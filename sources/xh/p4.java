package xh;
public final class p4 implements Runnable {
    public final int f51457a;
    public final z4 f51458b;

    public p4(z4 z4Var, int i10) {
        this.f51457a = i10;
        this.f51458b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f51457a) {
            case 0:
                this.f51458b.Z(false);
                return;
            case 1:
                this.f51458b.Z(true);
                return;
            case 2:
                z4.V(this.f51458b);
                return;
            case 3:
                z4.U(this.f51458b);
                return;
            case 4:
                z4.S(this.f51458b);
                return;
            default:
                this.f51458b.dismiss();
                return;
        }
    }
}
