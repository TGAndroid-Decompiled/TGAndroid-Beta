package xh;
public final class p4 implements Runnable {
    public final int f46348a;
    public final z4 f46349b;

    public p4(z4 z4Var, int i10) {
        this.f46348a = i10;
        this.f46349b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f46348a) {
            case 0:
                this.f46349b.Y(false);
                return;
            case 1:
                this.f46349b.Y(true);
                return;
            case 2:
                z4.U(this.f46349b);
                return;
            case 3:
                z4.T(this.f46349b);
                return;
            case 4:
                z4.R(this.f46349b);
                return;
            default:
                this.f46349b.dismiss();
                return;
        }
    }
}
