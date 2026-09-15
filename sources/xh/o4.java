package xh;
public final class o4 implements Runnable {
    public final int f46055a;
    public final y4 f46056b;

    public o4(y4 y4Var, int i10) {
        this.f46055a = i10;
        this.f46056b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f46055a) {
            case 0:
                this.f46056b.Y(false);
                return;
            case 1:
                this.f46056b.Y(true);
                return;
            case 2:
                y4.U(this.f46056b);
                return;
            case 3:
                y4.T(this.f46056b);
                return;
            case 4:
                y4.R(this.f46056b);
                return;
            default:
                this.f46056b.dismiss();
                return;
        }
    }
}
