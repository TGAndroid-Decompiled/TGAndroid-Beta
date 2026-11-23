package x2;
public final class p0 implements Runnable {
    public final int f60323a;
    public final w0 f60324b;

    public p0(w0 w0Var, int i7) {
        this.f60323a = i7;
        this.f60324b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f60323a) {
            case 0:
                this.f60324b.f60386c0 = true;
                return;
            case 1:
                this.f60324b.y();
                return;
            default:
                w0 w0Var = this.f60324b;
                if (!w0Var.f60394i0) {
                    d0 d0Var = w0Var.J;
                    d0Var.getClass();
                    d0Var.i2(w0Var);
                    return;
                }
                return;
        }
    }
}
