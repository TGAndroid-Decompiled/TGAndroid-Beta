package xh;
public final class p4 implements Runnable {
    public final int f46390a;
    public final z4 f46391b;

    public p4(z4 z4Var, int i10) {
        this.f46390a = i10;
        this.f46391b = z4Var;
    }

    @Override
    public final void run() {
        switch (this.f46390a) {
            case 0:
                this.f46391b.Y(false);
                return;
            case 1:
                this.f46391b.Y(true);
                return;
            case 2:
                z4.U(this.f46391b);
                return;
            case 3:
                z4.T(this.f46391b);
                return;
            case 4:
                z4.R(this.f46391b);
                return;
            default:
                this.f46391b.dismiss();
                return;
        }
    }
}
