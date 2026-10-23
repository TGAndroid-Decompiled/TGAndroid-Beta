package yh;
public final class n4 implements Runnable {
    public final int f50424a;
    public final x4 f50425b;

    public n4(x4 x4Var, int i10) {
        this.f50424a = i10;
        this.f50425b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50424a) {
            case 0:
                this.f50425b.Z(false);
                return;
            case 1:
                this.f50425b.Z(true);
                return;
            case 2:
                x4.V(this.f50425b);
                return;
            case 3:
                x4.U(this.f50425b);
                return;
            case 4:
                x4.S(this.f50425b);
                return;
            default:
                this.f50425b.dismiss();
                return;
        }
    }
}
