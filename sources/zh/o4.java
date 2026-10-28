package zh;
public final class o4 implements Runnable {
    public final int f53238a;
    public final y4 f53239b;

    public o4(y4 y4Var, int i10) {
        this.f53238a = i10;
        this.f53239b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f53238a) {
            case 0:
                this.f53239b.Y(false);
                return;
            case 1:
                this.f53239b.Y(true);
                return;
            case 2:
                y4.U(this.f53239b);
                return;
            case 3:
                y4.T(this.f53239b);
                return;
            case 4:
                y4.R(this.f53239b);
                return;
            default:
                this.f53239b.dismiss();
                return;
        }
    }
}
