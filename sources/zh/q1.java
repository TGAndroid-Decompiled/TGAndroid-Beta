package zh;
public final class q1 implements Runnable {
    public final int f60423a;
    public final a2 f60424b;

    public q1(a2 a2Var, int i7) {
        this.f60423a = i7;
        this.f60424b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f60423a) {
            case 0:
                this.f60424b.setReordering(true);
                return;
            case 1:
                this.f60424b.setReordering(true);
                return;
            case 2:
                this.f60424b.f(false);
                return;
            default:
                this.f60424b.setReordering(true);
                return;
        }
    }
}
