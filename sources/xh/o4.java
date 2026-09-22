package xh;
public final class o4 implements Runnable {
    public final int f46051a;
    public final y4 f46052b;

    public o4(y4 y4Var, int i10) {
        this.f46051a = i10;
        this.f46052b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f46051a) {
            case 0:
                this.f46052b.Y(false);
                return;
            case 1:
                this.f46052b.Y(true);
                return;
            case 2:
                y4.U(this.f46052b);
                return;
            case 3:
                y4.T(this.f46052b);
                return;
            case 4:
                y4.R(this.f46052b);
                return;
            default:
                this.f46052b.dismiss();
                return;
        }
    }
}
