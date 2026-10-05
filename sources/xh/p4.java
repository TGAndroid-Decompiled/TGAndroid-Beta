package xh;
public final class p4 implements Runnable {
    public final int f50188a;
    public final z4 f50189b;

    public p4(z4 z4Var, int i10) {
        this.f50188a = i10;
        this.f50189b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f50188a) {
            case 0:
                this.f50189b.X(false);
                return;
            case 1:
                this.f50189b.X(true);
                return;
            case 2:
                z4.S(this.f50189b);
                return;
            case 3:
                z4.R(this.f50189b);
                return;
            case 4:
                z4.P(this.f50189b);
                return;
            default:
                this.f50189b.dismiss();
                return;
        }
    }
}
