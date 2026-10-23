package yh;
public final class n4 implements Runnable {
    public final int f50881a;
    public final x4 f50882b;

    public n4(x4 x4Var, int i10) {
        this.f50881a = i10;
        this.f50882b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50881a) {
            case 0:
                this.f50882b.Y(false);
                return;
            case 1:
                this.f50882b.Y(true);
                return;
            case 2:
                x4.U(this.f50882b);
                return;
            case 3:
                x4.T(this.f50882b);
                return;
            case 4:
                x4.R(this.f50882b);
                return;
            default:
                this.f50882b.dismiss();
                return;
        }
    }
}
