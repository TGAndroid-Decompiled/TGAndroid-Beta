package xh;
public final class c2 implements Runnable {
    public final int f51424a;
    public final n2 f51425b;

    public c2(n2 n2Var, int i10) {
        this.f51424a = i10;
        this.f51425b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f51424a) {
            case 0:
                this.f51425b.setReordering(true);
                return;
            case 1:
                this.f51425b.setReordering(true);
                return;
            case 2:
                this.f51425b.f(false);
                return;
            default:
                this.f51425b.setReordering(true);
                return;
        }
    }
}
