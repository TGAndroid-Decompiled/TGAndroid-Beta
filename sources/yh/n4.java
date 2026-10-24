package yh;
public final class n4 implements Runnable {
    public final int f50880a;
    public final x4 f50881b;

    public n4(x4 x4Var, int i10) {
        this.f50880a = i10;
        this.f50881b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50880a) {
            case 0:
                this.f50881b.Y(false);
                return;
            case 1:
                this.f50881b.Y(true);
                return;
            case 2:
                x4.U(this.f50881b);
                return;
            case 3:
                x4.T(this.f50881b);
                return;
            case 4:
                x4.R(this.f50881b);
                return;
            default:
                this.f50881b.dismiss();
                return;
        }
    }
}
