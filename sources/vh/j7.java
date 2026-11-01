package vh;
public final class j7 implements Runnable {
    public final int f51338a;
    public final o8 f51339b;

    public j7(o8 o8Var, int i10) {
        this.f51338a = i10;
        this.f51339b = o8Var;
    }

    @Override
    public final void run() {
        switch (this.f51338a) {
            case 0:
                o8 o8Var = this.f51339b;
                o8Var.getClass();
                o8Var.f(1.0f, true, new y6(o8Var, 6));
                o8Var.f51624b1.b(true, true);
                return;
            default:
                o8 o8Var2 = this.f51339b;
                o8Var2.e(false);
                o8Var2.f51658m2 = null;
                return;
        }
    }
}
