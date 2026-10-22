package yh;
public final class a2 implements Runnable {
    public final int f50175a;
    public final l2 f50176b;

    public a2(l2 l2Var, int i10) {
        this.f50175a = i10;
        this.f50176b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f50175a) {
            case 0:
                this.f50176b.setReordering(true);
                return;
            case 1:
                this.f50176b.setReordering(true);
                return;
            case 2:
                this.f50176b.f(false);
                return;
            default:
                this.f50176b.setReordering(true);
                return;
        }
    }
}
