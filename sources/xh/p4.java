package xh;
public final class p4 implements Runnable {
    public final int f50172a;
    public final z4 f50173b;

    public p4(z4 z4Var, int i10) {
        this.f50172a = i10;
        this.f50173b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f50172a) {
            case 0:
                this.f50173b.X(false);
                return;
            case 1:
                this.f50173b.X(true);
                return;
            case 2:
                z4.S(this.f50173b);
                return;
            case 3:
                z4.R(this.f50173b);
                return;
            case 4:
                z4.P(this.f50173b);
                return;
            default:
                this.f50173b.dismiss();
                return;
        }
    }
}
