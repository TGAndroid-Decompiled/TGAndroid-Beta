package wg;
public final class r0 implements Runnable {
    public final int f57687a;
    public final w0 f57688b;

    public r0(w0 w0Var, int i7) {
        this.f57687a = i7;
        this.f57688b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f57687a) {
            case 0:
                this.f57688b.i1(true);
                return;
            case 1:
                this.f57688b.n1(true, false);
                return;
            case 2:
                this.f57688b.e1();
                return;
            case 3:
                this.f57688b.n1(true, false);
                return;
            case 4:
                this.f57688b.n1(true, false);
                return;
            case 5:
                this.f57688b.n1(true, false);
                return;
            case 6:
                w0 w0Var = this.f57688b;
                w0Var.W1.clear();
                w0Var.X1.clear();
                w0Var.dismiss();
                return;
            default:
                this.f57688b.dismiss();
                return;
        }
    }
}
