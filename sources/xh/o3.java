package xh;
public final class o3 implements Runnable {
    public final int f53945a;
    public final p3 f53946b;

    public o3(p3 p3Var, int i10) {
        this.f53945a = i10;
        this.f53946b = p3Var;
    }

    @Override
    public final void run() {
        switch (this.f53945a) {
            case 0:
                p3 p3Var = this.f53946b;
                if (p3Var.f53976x) {
                    p3Var.d();
                    return;
                }
                return;
            default:
                this.f53946b.invalidateSelf();
                return;
        }
    }
}
