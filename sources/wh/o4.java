package wh;
public final class o4 implements Runnable {
    public final int f44279a;
    public final y4 f44280b;

    public o4(y4 y4Var, int i10) {
        this.f44279a = i10;
        this.f44280b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f44279a) {
            case 0:
                this.f44280b.Y(false);
                return;
            case 1:
                this.f44280b.Y(true);
                return;
            case 2:
                y4.U(this.f44280b);
                return;
            case 3:
                y4.T(this.f44280b);
                return;
            case 4:
                y4.R(this.f44280b);
                return;
            default:
                this.f44280b.dismiss();
                return;
        }
    }
}
