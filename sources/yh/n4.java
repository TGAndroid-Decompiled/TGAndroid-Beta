package yh;
public final class n4 implements Runnable {
    public final int f50414a;
    public final x4 f50415b;

    public n4(x4 x4Var, int i10) {
        this.f50414a = i10;
        this.f50415b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50414a) {
            case 0:
                this.f50415b.Z(false);
                return;
            case 1:
                this.f50415b.Z(true);
                return;
            case 2:
                x4.V(this.f50415b);
                return;
            case 3:
                x4.U(this.f50415b);
                return;
            case 4:
                x4.S(this.f50415b);
                return;
            default:
                this.f50415b.dismiss();
                return;
        }
    }
}
