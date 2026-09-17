package yh;
public final class n4 implements Runnable {
    public final int f50491a;
    public final x4 f50492b;

    public n4(x4 x4Var, int i10) {
        this.f50491a = i10;
        this.f50492b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50491a) {
            case 0:
                this.f50492b.Y(false);
                return;
            case 1:
                this.f50492b.Y(true);
                return;
            case 2:
                x4.U(this.f50492b);
                return;
            case 3:
                x4.T(this.f50492b);
                return;
            case 4:
                x4.R(this.f50492b);
                return;
            default:
                this.f50492b.dismiss();
                return;
        }
    }
}
