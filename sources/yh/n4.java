package yh;
public final class n4 implements Runnable {
    public final int f50420a;
    public final x4 f50421b;

    public n4(x4 x4Var, int i10) {
        this.f50420a = i10;
        this.f50421b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50420a) {
            case 0:
                this.f50421b.Z(false);
                return;
            case 1:
                this.f50421b.Z(true);
                return;
            case 2:
                x4.V(this.f50421b);
                return;
            case 3:
                x4.U(this.f50421b);
                return;
            case 4:
                x4.S(this.f50421b);
                return;
            default:
                this.f50421b.dismiss();
                return;
        }
    }
}
