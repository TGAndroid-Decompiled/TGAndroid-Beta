package yh;
public final class a2 implements Runnable {
    public final int f50165a;
    public final l2 f50166b;

    public a2(l2 l2Var, int i10) {
        this.f50165a = i10;
        this.f50166b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f50165a) {
            case 0:
                this.f50166b.setReordering(true);
                return;
            case 1:
                this.f50166b.setReordering(true);
                return;
            case 2:
                this.f50166b.f(false);
                return;
            default:
                this.f50166b.setReordering(true);
                return;
        }
    }
}
