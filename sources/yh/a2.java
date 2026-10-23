package yh;
public final class a2 implements Runnable {
    public final int f50615a;
    public final l2 f50616b;

    public a2(l2 l2Var, int i10) {
        this.f50615a = i10;
        this.f50616b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f50615a) {
            case 0:
                this.f50616b.setReordering(true);
                return;
            case 1:
                this.f50616b.setReordering(true);
                return;
            case 2:
                this.f50616b.f(false);
                return;
            default:
                this.f50616b.setReordering(true);
                return;
        }
    }
}
