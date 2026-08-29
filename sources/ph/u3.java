package ph;
public final class u3 implements Runnable {
    public final int f46108a;
    public final v3 f46109b;

    public u3(v3 v3Var, int i10) {
        this.f46108a = i10;
        this.f46109b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f46108a) {
            case 0:
                v3 v3Var = this.f46109b;
                if (v3Var.f46132w) {
                    v3Var.d();
                    return;
                }
                return;
            default:
                this.f46109b.invalidateSelf();
                return;
        }
    }
}
