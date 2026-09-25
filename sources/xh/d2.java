package xh;
public final class d2 implements Runnable {
    public final int f46114a;
    public final o2 f46115b;

    public d2(o2 o2Var, int i10) {
        this.f46114a = i10;
        this.f46115b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46114a) {
            case 0:
                this.f46115b.setReordering(true);
                return;
            case 1:
                this.f46115b.setReordering(true);
                return;
            case 2:
                this.f46115b.f(false);
                return;
            default:
                this.f46115b.setReordering(true);
                return;
        }
    }
}
