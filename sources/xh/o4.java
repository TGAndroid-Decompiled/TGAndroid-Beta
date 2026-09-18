package xh;
public final class o4 implements Runnable {
    public final int f46083a;
    public final y4 f46084b;

    public o4(y4 y4Var, int i10) {
        this.f46083a = i10;
        this.f46084b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f46083a) {
            case 0:
                this.f46084b.Y(false);
                return;
            case 1:
                this.f46084b.Y(true);
                return;
            case 2:
                y4.U(this.f46084b);
                return;
            case 3:
                y4.T(this.f46084b);
                return;
            case 4:
                y4.R(this.f46084b);
                return;
            default:
                this.f46084b.dismiss();
                return;
        }
    }
}
