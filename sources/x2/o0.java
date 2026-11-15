package x2;
public final class o0 implements Runnable {
    public final int f59624a;
    public final v0 f59625b;

    public o0(v0 v0Var, int i7) {
        this.f59624a = i7;
        this.f59625b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f59624a) {
            case 0:
                this.f59625b.f59685c0 = true;
                return;
            case 1:
                this.f59625b.y();
                return;
            default:
                v0 v0Var = this.f59625b;
                if (!v0Var.f59693i0) {
                    c0 c0Var = v0Var.J;
                    c0Var.getClass();
                    c0Var.f0(v0Var);
                    return;
                }
                return;
        }
    }
}
