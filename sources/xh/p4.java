package xh;
public final class p4 implements Runnable {
    public final int f46457a;
    public final z4 f46458b;

    public p4(z4 z4Var, int i10) {
        this.f46457a = i10;
        this.f46458b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f46457a) {
            case 0:
                this.f46458b.Y(false);
                return;
            case 1:
                this.f46458b.Y(true);
                return;
            case 2:
                z4.U(this.f46458b);
                return;
            case 3:
                z4.T(this.f46458b);
                return;
            case 4:
                z4.R(this.f46458b);
                return;
            default:
                this.f46458b.dismiss();
                return;
        }
    }
}
