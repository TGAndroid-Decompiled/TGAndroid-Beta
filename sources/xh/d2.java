package xh;
public final class d2 implements Runnable {
    public final int f49933a;
    public final o2 f49934b;

    public d2(o2 o2Var, int i10) {
        this.f49933a = i10;
        this.f49934b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f49933a) {
            case 0:
                this.f49934b.setReordering(true);
                return;
            case 1:
                this.f49934b.setReordering(true);
                return;
            case 2:
                this.f49934b.f(false);
                return;
            default:
                this.f49934b.setReordering(true);
                return;
        }
    }
}
