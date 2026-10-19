package yh;
public final class n4 implements Runnable {
    public final int f50413a;
    public final x4 f50414b;

    public n4(x4 x4Var, int i10) {
        this.f50413a = i10;
        this.f50414b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f50413a) {
            case 0:
                this.f50414b.Z(false);
                return;
            case 1:
                this.f50414b.Z(true);
                return;
            case 2:
                x4.V(this.f50414b);
                return;
            case 3:
                x4.U(this.f50414b);
                return;
            case 4:
                x4.S(this.f50414b);
                return;
            default:
                this.f50414b.dismiss();
                return;
        }
    }
}
