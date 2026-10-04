package xh;
public final class p4 implements Runnable {
    public final int f50181a;
    public final z4 f50182b;

    public p4(z4 z4Var, int i10) {
        this.f50181a = i10;
        this.f50182b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f50181a) {
            case 0:
                this.f50182b.X(false);
                return;
            case 1:
                this.f50182b.X(true);
                return;
            case 2:
                z4.S(this.f50182b);
                return;
            case 3:
                z4.R(this.f50182b);
                return;
            case 4:
                z4.P(this.f50182b);
                return;
            default:
                this.f50182b.dismiss();
                return;
        }
    }
}
