package xh;
public final class o4 implements Runnable {
    public final int f51667a;
    public final y4 f51668b;

    public o4(y4 y4Var, int i10) {
        this.f51667a = i10;
        this.f51668b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f51667a) {
            case 0:
                this.f51668b.Z(false);
                return;
            case 1:
                this.f51668b.Z(true);
                return;
            case 2:
                y4.V(this.f51668b);
                return;
            case 3:
                y4.U(this.f51668b);
                return;
            case 4:
                y4.S(this.f51668b);
                return;
            default:
                this.f51668b.dismiss();
                return;
        }
    }
}
