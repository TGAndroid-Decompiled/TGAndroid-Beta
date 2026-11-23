package wg;
public final class q0 implements Runnable {
    public final int f59922a;
    public final v0 f59923b;

    public q0(v0 v0Var, int i7) {
        this.f59922a = i7;
        this.f59923b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f59922a) {
            case 0:
                this.f59923b.j1(true);
                return;
            case 1:
                this.f59923b.o1(true, false);
                return;
            case 2:
                this.f59923b.f1();
                return;
            case 3:
                this.f59923b.o1(true, false);
                return;
            case 4:
                this.f59923b.o1(true, false);
                return;
            case 5:
                this.f59923b.o1(true, false);
                return;
            case 6:
                v0 v0Var = this.f59923b;
                v0Var.f59939a2.clear();
                v0Var.f59940b2.clear();
                v0Var.dismiss();
                return;
            default:
                this.f59923b.dismiss();
                return;
        }
    }
}
