package xh;
public final class p4 implements Runnable {
    public final int f46322a;
    public final z4 f46323b;

    public p4(z4 z4Var, int i10) {
        this.f46322a = i10;
        this.f46323b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f46322a) {
            case 0:
                this.f46323b.Y(false);
                return;
            case 1:
                this.f46323b.Y(true);
                return;
            case 2:
                z4.U(this.f46323b);
                return;
            case 3:
                z4.T(this.f46323b);
                return;
            case 4:
                z4.R(this.f46323b);
                return;
            default:
                this.f46323b.dismiss();
                return;
        }
    }
}
