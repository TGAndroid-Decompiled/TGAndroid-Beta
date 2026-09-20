package xh;
public final class p4 implements Runnable {
    public final int f46369a;
    public final z4 f46370b;

    public p4(z4 z4Var, int i10) {
        this.f46369a = i10;
        this.f46370b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f46369a) {
            case 0:
                this.f46370b.Y(false);
                return;
            case 1:
                this.f46370b.Y(true);
                return;
            case 2:
                z4.U(this.f46370b);
                return;
            case 3:
                z4.T(this.f46370b);
                return;
            case 4:
                z4.R(this.f46370b);
                return;
            default:
                this.f46370b.dismiss();
                return;
        }
    }
}
