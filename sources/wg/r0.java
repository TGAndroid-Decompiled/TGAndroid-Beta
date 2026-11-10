package wg;
public final class r0 implements Runnable {
    public final int f57799a;
    public final w0 f57800b;

    public r0(w0 w0Var, int i7) {
        this.f57799a = i7;
        this.f57800b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f57799a) {
            case 0:
                this.f57800b.i1(true);
                return;
            case 1:
                this.f57800b.n1(true, false);
                return;
            case 2:
                this.f57800b.e1();
                return;
            case 3:
                this.f57800b.n1(true, false);
                return;
            case 4:
                this.f57800b.n1(true, false);
                return;
            case 5:
                this.f57800b.n1(true, false);
                return;
            case 6:
                w0 w0Var = this.f57800b;
                w0Var.Z1.clear();
                w0Var.f57817a2.clear();
                w0Var.dismiss();
                return;
            default:
                this.f57800b.dismiss();
                return;
        }
    }
}
