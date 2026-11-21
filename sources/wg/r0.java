package wg;
public final class r0 implements Runnable {
    public final int f59858a;
    public final w0 f59859b;

    public r0(w0 w0Var, int i7) {
        this.f59858a = i7;
        this.f59859b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f59858a) {
            case 0:
                this.f59859b.j1(true);
                return;
            case 1:
                this.f59859b.o1(true, false);
                return;
            case 2:
                this.f59859b.f1();
                return;
            case 3:
                this.f59859b.o1(true, false);
                return;
            case 4:
                this.f59859b.o1(true, false);
                return;
            case 5:
                this.f59859b.o1(true, false);
                return;
            case 6:
                w0 w0Var = this.f59859b;
                w0Var.f59875a2.clear();
                w0Var.f59876b2.clear();
                w0Var.dismiss();
                return;
            default:
                this.f59859b.dismiss();
                return;
        }
    }
}
