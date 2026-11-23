package wg;
public final class r0 implements Runnable {
    public final int f59827a;
    public final w0 f59828b;

    public r0(w0 w0Var, int i7) {
        this.f59827a = i7;
        this.f59828b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f59827a) {
            case 0:
                this.f59828b.j1(true);
                return;
            case 1:
                this.f59828b.o1(true, false);
                return;
            case 2:
                this.f59828b.f1();
                return;
            case 3:
                this.f59828b.o1(true, false);
                return;
            case 4:
                this.f59828b.o1(true, false);
                return;
            case 5:
                this.f59828b.o1(true, false);
                return;
            case 6:
                w0 w0Var = this.f59828b;
                w0Var.f59844a2.clear();
                w0Var.f59845b2.clear();
                w0Var.dismiss();
                return;
            default:
                this.f59828b.dismiss();
                return;
        }
    }
}
