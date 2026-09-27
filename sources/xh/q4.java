package xh;
public final class q4 implements Runnable {
    public final int f46430a;
    public final a5 f46431b;

    public q4(a5 a5Var, int i10) {
        this.f46430a = i10;
        this.f46431b = a5Var;
    }

    @Override
    public final void run() {
        switch (this.f46430a) {
            case 0:
                this.f46431b.Y(false);
                return;
            case 1:
                this.f46431b.Y(true);
                return;
            case 2:
                a5.U(this.f46431b);
                return;
            case 3:
                a5.T(this.f46431b);
                return;
            case 4:
                a5.R(this.f46431b);
                return;
            default:
                this.f46431b.dismiss();
                return;
        }
    }
}
