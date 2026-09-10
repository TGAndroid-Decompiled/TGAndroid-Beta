package zh;
public final class m6 implements Runnable {
    public final int f48694a;
    public final n6 f48695b;

    public m6(n6 n6Var, int i10) {
        this.f48694a = i10;
        this.f48695b = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f48694a) {
            case 0:
                o6 o6Var = this.f48695b.v;
                o6Var.f48757s = 0;
                o6Var.requestLayout();
                p6 p6Var = o6Var.J;
                p6Var.L(p6Var.getWidth(), p6Var.getHeight());
                p6Var.requestLayout();
                return;
            case 1:
                o6 o6Var2 = this.f48695b.v;
                o6Var2.f48757s = 0;
                o6Var2.requestLayout();
                p6 p6Var2 = o6Var2.J;
                p6Var2.L(p6Var2.getWidth(), p6Var2.getHeight());
                p6Var2.requestLayout();
                return;
            case 2:
                n6 n6Var = this.f48695b;
                n6Var.v.post(new m6(n6Var, 3));
                return;
            default:
                this.f48695b.v.f48759x = true;
                return;
        }
    }
}
