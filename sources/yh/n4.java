package yh;
public final class n4 implements Runnable {
    public final int f50415a;
    public final x4 f50416b;

    public n4(x4 x4Var, int i10) {
        this.f50415a = i10;
        this.f50416b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50415a) {
            case 0:
                this.f50416b.Z(false);
                return;
            case 1:
                this.f50416b.Z(true);
                return;
            case 2:
                x4.V(this.f50416b);
                return;
            case 3:
                x4.U(this.f50416b);
                return;
            case 4:
                x4.S(this.f50416b);
                return;
            default:
                this.f50416b.dismiss();
                return;
        }
    }
}
