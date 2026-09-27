package xh;
public final class e2 implements Runnable {
    public final int f46188a;
    public final p2 f46189b;

    public e2(p2 p2Var, int i10) {
        this.f46188a = i10;
        this.f46189b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f46188a) {
            case 0:
                this.f46189b.setReordering(true);
                return;
            case 1:
                this.f46189b.setReordering(true);
                return;
            case 2:
                this.f46189b.f(false);
                return;
            default:
                this.f46189b.setReordering(true);
                return;
        }
    }
}
