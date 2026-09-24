package xh;
public final class p4 implements Runnable {
    public final int f46335a;
    public final z4 f46336b;

    public p4(z4 z4Var, int i10) {
        this.f46335a = i10;
        this.f46336b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f46335a) {
            case 0:
                this.f46336b.Y(false);
                return;
            case 1:
                this.f46336b.Y(true);
                return;
            case 2:
                z4.U(this.f46336b);
                return;
            case 3:
                z4.T(this.f46336b);
                return;
            case 4:
                z4.R(this.f46336b);
                return;
            default:
                this.f46336b.dismiss();
                return;
        }
    }
}
