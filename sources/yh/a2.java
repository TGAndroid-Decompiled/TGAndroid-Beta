package yh;
public final class a2 implements Runnable {
    public final int f50176a;
    public final l2 f50177b;

    public a2(l2 l2Var, int i10) {
        this.f50176a = i10;
        this.f50177b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f50176a) {
            case 0:
                this.f50177b.setReordering(true);
                return;
            case 1:
                this.f50177b.setReordering(true);
                return;
            case 2:
                this.f50177b.f(false);
                return;
            default:
                this.f50177b.setReordering(true);
                return;
        }
    }
}
