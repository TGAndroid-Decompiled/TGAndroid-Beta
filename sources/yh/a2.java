package yh;
public final class a2 implements Runnable {
    public final int f50172a;
    public final l2 f50173b;

    public a2(l2 l2Var, int i10) {
        this.f50172a = i10;
        this.f50173b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f50172a) {
            case 0:
                this.f50173b.setReordering(true);
                return;
            case 1:
                this.f50173b.setReordering(true);
                return;
            case 2:
                this.f50173b.f(false);
                return;
            default:
                this.f50173b.setReordering(true);
                return;
        }
    }
}
