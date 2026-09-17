package yh;
public final class n4 implements Runnable {
    public final int f50462a;
    public final x4 f50463b;

    public n4(x4 x4Var, int i10) {
        this.f50462a = i10;
        this.f50463b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50462a) {
            case 0:
                this.f50463b.Y(false);
                return;
            case 1:
                this.f50463b.Y(true);
                return;
            case 2:
                x4.U(this.f50463b);
                return;
            case 3:
                x4.T(this.f50463b);
                return;
            case 4:
                x4.R(this.f50463b);
                return;
            default:
                this.f50463b.dismiss();
                return;
        }
    }
}
