package xh;
public final class o4 implements Runnable {
    public final int f51675a;
    public final y4 f51676b;

    public o4(y4 y4Var, int i10) {
        this.f51675a = i10;
        this.f51676b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f51675a) {
            case 0:
                this.f51676b.Z(false);
                return;
            case 1:
                this.f51676b.Z(true);
                return;
            case 2:
                y4.V(this.f51676b);
                return;
            case 3:
                y4.U(this.f51676b);
                return;
            case 4:
                y4.S(this.f51676b);
                return;
            default:
                this.f51676b.dismiss();
                return;
        }
    }
}
