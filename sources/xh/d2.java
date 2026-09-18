package xh;
public final class d2 implements Runnable {
    public final int f46086a;
    public final o2 f46087b;

    public d2(o2 o2Var, int i10) {
        this.f46086a = i10;
        this.f46087b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46086a) {
            case 0:
                this.f46087b.setReordering(true);
                return;
            case 1:
                this.f46087b.setReordering(true);
                return;
            case 2:
                this.f46087b.f(false);
                return;
            default:
                this.f46087b.setReordering(true);
                return;
        }
    }
}
