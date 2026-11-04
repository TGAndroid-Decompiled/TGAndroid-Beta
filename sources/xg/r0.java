package xg;
public final class r0 implements Runnable {
    public final int f58754a;
    public final w0 f58755b;

    public r0(w0 w0Var, int i3) {
        this.f58754a = i3;
        this.f58755b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f58754a) {
            case 0:
                this.f58755b.i1(true);
                return;
            case 1:
                this.f58755b.n1(true, false);
                return;
            case 2:
                this.f58755b.e1();
                return;
            case 3:
                this.f58755b.n1(true, false);
                return;
            case 4:
                this.f58755b.n1(true, false);
                return;
            case 5:
                this.f58755b.n1(true, false);
                return;
            case 6:
                w0 w0Var = this.f58755b;
                w0Var.X1.clear();
                w0Var.Y1.clear();
                w0Var.dismiss();
                return;
            default:
                this.f58755b.dismiss();
                return;
        }
    }
}
