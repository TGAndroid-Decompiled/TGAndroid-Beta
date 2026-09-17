package xh;
public final class o4 implements Runnable {
    public final int f46078a;
    public final y4 f46079b;

    public o4(y4 y4Var, int i10) {
        this.f46078a = i10;
        this.f46079b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f46078a) {
            case 0:
                this.f46079b.Y(false);
                return;
            case 1:
                this.f46079b.Y(true);
                return;
            case 2:
                y4.U(this.f46079b);
                return;
            case 3:
                y4.T(this.f46079b);
                return;
            case 4:
                y4.R(this.f46079b);
                return;
            default:
                this.f46079b.dismiss();
                return;
        }
    }
}
