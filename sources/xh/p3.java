package xh;
public final class p3 implements Runnable {
    public final int f53987a;
    public final q3 f53988b;

    public p3(q3 q3Var, int i10) {
        this.f53987a = i10;
        this.f53988b = q3Var;
    }

    @Override
    public final void run() {
        switch (this.f53987a) {
            case 0:
                q3 q3Var = this.f53988b;
                if (q3Var.f54012x) {
                    q3Var.d();
                    return;
                }
                return;
            default:
                this.f53988b.invalidateSelf();
                return;
        }
    }
}
