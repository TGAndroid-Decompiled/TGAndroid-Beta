package zh;
public final class q1 implements Runnable {
    public final int f60418a;
    public final a2 f60419b;

    public q1(a2 a2Var, int i7) {
        this.f60418a = i7;
        this.f60419b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f60418a) {
            case 0:
                this.f60419b.setReordering(true);
                return;
            case 1:
                this.f60419b.setReordering(true);
                return;
            case 2:
                this.f60419b.f(false);
                return;
            default:
                this.f60419b.setReordering(true);
                return;
        }
    }
}
