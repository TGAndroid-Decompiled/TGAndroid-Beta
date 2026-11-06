package zh;
public final class q1 implements Runnable {
    public final int f60417a;
    public final a2 f60418b;

    public q1(a2 a2Var, int i7) {
        this.f60417a = i7;
        this.f60418b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f60417a) {
            case 0:
                this.f60418b.setReordering(true);
                return;
            case 1:
                this.f60418b.setReordering(true);
                return;
            case 2:
                this.f60418b.f(false);
                return;
            default:
                this.f60418b.setReordering(true);
                return;
        }
    }
}
