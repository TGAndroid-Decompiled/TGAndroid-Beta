package xh;
public final class p4 implements Runnable {
    public final int f46350a;
    public final z4 f46351b;

    public p4(z4 z4Var, int i10) {
        this.f46350a = i10;
        this.f46351b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f46350a) {
            case 0:
                this.f46351b.Y(false);
                return;
            case 1:
                this.f46351b.Y(true);
                return;
            case 2:
                z4.U(this.f46351b);
                return;
            case 3:
                z4.T(this.f46351b);
                return;
            case 4:
                z4.R(this.f46351b);
                return;
            default:
                this.f46351b.dismiss();
                return;
        }
    }
}
