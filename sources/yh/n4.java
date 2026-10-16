package yh;
public final class n4 implements Runnable {
    public final int f49037a;
    public final x4 f49038b;

    public n4(x4 x4Var, int i10) {
        this.f49037a = i10;
        this.f49038b = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f49037a) {
            case 0:
                this.f49038b.Z(false);
                return;
            case 1:
                this.f49038b.Z(true);
                return;
            case 2:
                x4.V(this.f49038b);
                return;
            case 3:
                x4.U(this.f49038b);
                return;
            case 4:
                x4.S(this.f49038b);
                return;
            default:
                this.f49038b.dismiss();
                return;
        }
    }
}
