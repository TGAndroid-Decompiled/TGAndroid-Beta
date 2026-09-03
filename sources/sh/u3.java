package sh;
public final class u3 implements Runnable {
    public final int f47769a;
    public final v3 f47770b;

    public u3(v3 v3Var, int i10) {
        this.f47769a = i10;
        this.f47770b = v3Var;
    }

    @Override
    public final void run() {
        switch (this.f47769a) {
            case 0:
                v3 v3Var = this.f47770b;
                if (v3Var.f47793w) {
                    v3Var.d();
                    return;
                }
                return;
            default:
                this.f47770b.invalidateSelf();
                return;
        }
    }
}
