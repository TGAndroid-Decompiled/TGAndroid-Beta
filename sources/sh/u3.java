package sh;
public final class u3 implements Runnable {
    public final int f47733a;
    public final v3 f47734b;

    public u3(v3 v3Var, int i10) {
        this.f47733a = i10;
        this.f47734b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f47733a) {
            case 0:
                v3 v3Var = this.f47734b;
                if (v3Var.f47757w) {
                    v3Var.d();
                    return;
                }
                return;
            default:
                this.f47734b.invalidateSelf();
                return;
        }
    }
}
