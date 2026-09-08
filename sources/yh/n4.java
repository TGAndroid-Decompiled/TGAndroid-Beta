package yh;
public final class n4 implements Runnable {
    public final int f50490a;
    public final x4 f50491b;

    public n4(x4 x4Var, int i10) {
        this.f50490a = i10;
        this.f50491b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50490a) {
            case 0:
                this.f50491b.Y(false);
                return;
            case 1:
                this.f50491b.Y(true);
                return;
            case 2:
                x4.U(this.f50491b);
                return;
            case 3:
                x4.T(this.f50491b);
                return;
            case 4:
                x4.R(this.f50491b);
                return;
            default:
                this.f50491b.dismiss();
                return;
        }
    }
}
