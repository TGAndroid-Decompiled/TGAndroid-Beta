package xh;
public final class c2 implements Runnable {
    public final int f51416a;
    public final n2 f51417b;

    public c2(n2 n2Var, int i10) {
        this.f51416a = i10;
        this.f51417b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f51416a) {
            case 0:
                this.f51417b.setReordering(true);
                return;
            case 1:
                this.f51417b.setReordering(true);
                return;
            case 2:
                this.f51417b.f(false);
                return;
            default:
                this.f51417b.setReordering(true);
                return;
        }
    }
}
