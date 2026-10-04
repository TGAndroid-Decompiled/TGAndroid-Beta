package xh;
public final class p4 implements Runnable {
    public final int f50173a;
    public final z4 f50174b;

    public p4(z4 z4Var, int i10) {
        this.f50173a = i10;
        this.f50174b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f50173a) {
            case 0:
                this.f50174b.X(false);
                return;
            case 1:
                this.f50174b.X(true);
                return;
            case 2:
                z4.S(this.f50174b);
                return;
            case 3:
                z4.R(this.f50174b);
                return;
            case 4:
                z4.P(this.f50174b);
                return;
            default:
                this.f50174b.dismiss();
                return;
        }
    }
}
