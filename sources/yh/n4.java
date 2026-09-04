package yh;
public final class n4 implements Runnable {
    public final int f50461a;
    public final x4 f50462b;

    public n4(x4 x4Var, int i10) {
        this.f50461a = i10;
        this.f50462b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50461a) {
            case 0:
                this.f50462b.Y(false);
                return;
            case 1:
                this.f50462b.Y(true);
                return;
            case 2:
                x4.U(this.f50462b);
                return;
            case 3:
                x4.T(this.f50462b);
                return;
            case 4:
                x4.R(this.f50462b);
                return;
            default:
                this.f50462b.dismiss();
                return;
        }
    }
}
