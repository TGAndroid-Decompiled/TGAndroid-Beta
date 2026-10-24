package yh;
public final class a2 implements Runnable {
    public final int f50614a;
    public final l2 f50615b;

    public a2(l2 l2Var, int i10) {
        this.f50614a = i10;
        this.f50615b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f50614a) {
            case 0:
                this.f50615b.setReordering(true);
                return;
            case 1:
                this.f50615b.setReordering(true);
                return;
            case 2:
                this.f50615b.f(false);
                return;
            default:
                this.f50615b.setReordering(true);
                return;
        }
    }
}
