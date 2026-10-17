package yh;
public final class o4 implements Runnable {
    public final int f50449a;
    public final y4 f50450b;

    public o4(y4 y4Var, int i10) {
        this.f50449a = i10;
        this.f50450b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f50449a) {
            case 0:
                this.f50450b.Z(false);
                return;
            case 1:
                this.f50450b.Z(true);
                return;
            case 2:
                y4.V(this.f50450b);
                return;
            case 3:
                y4.U(this.f50450b);
                return;
            case 4:
                y4.S(this.f50450b);
                return;
            default:
                this.f50450b.dismiss();
                return;
        }
    }
}
