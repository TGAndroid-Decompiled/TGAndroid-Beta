package rh;
public final class u3 implements Runnable {
    public final int f43869a;
    public final v3 f43870b;

    public u3(v3 v3Var, int i10) {
        this.f43869a = i10;
        this.f43870b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f43869a) {
            case 0:
                v3 v3Var = this.f43870b;
                if (v3Var.f43890w) {
                    v3Var.d();
                    return;
                }
                return;
            default:
                this.f43870b.invalidateSelf();
                return;
        }
    }
}
