package yh;
public final class n4 implements Runnable {
    public final int f50423a;
    public final x4 f50424b;

    public n4(x4 x4Var, int i10) {
        this.f50423a = i10;
        this.f50424b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50423a) {
            case 0:
                this.f50424b.Z(false);
                return;
            case 1:
                this.f50424b.Z(true);
                return;
            case 2:
                x4.V(this.f50424b);
                return;
            case 3:
                x4.U(this.f50424b);
                return;
            case 4:
                x4.S(this.f50424b);
                return;
            default:
                this.f50424b.dismiss();
                return;
        }
    }
}
