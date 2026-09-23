package xh;
public final class p4 implements Runnable {
    public final int f46021a;
    public final z4 f46022b;

    public p4(z4 z4Var, int i10) {
        this.f46021a = i10;
        this.f46022b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f46021a) {
            case 0:
                this.f46022b.Y(false);
                return;
            case 1:
                this.f46022b.Y(true);
                return;
            case 2:
                z4.U(this.f46022b);
                return;
            case 3:
                z4.T(this.f46022b);
                return;
            case 4:
                z4.R(this.f46022b);
                return;
            default:
                this.f46022b.dismiss();
                return;
        }
    }
}
