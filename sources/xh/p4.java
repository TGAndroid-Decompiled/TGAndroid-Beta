package xh;
public final class p4 implements Runnable {
    public final int f46349a;
    public final z4 f46350b;

    public p4(z4 z4Var, int i10) {
        this.f46349a = i10;
        this.f46350b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f46349a) {
            case 0:
                this.f46350b.Y(false);
                return;
            case 1:
                this.f46350b.Y(true);
                return;
            case 2:
                z4.U(this.f46350b);
                return;
            case 3:
                z4.T(this.f46350b);
                return;
            case 4:
                z4.R(this.f46350b);
                return;
            default:
                this.f46350b.dismiss();
                return;
        }
    }
}
