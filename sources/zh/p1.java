package zh;
public final class p1 implements Runnable {
    public final int f60519a;
    public final z1 f60520b;

    public p1(z1 z1Var, int i7) {
        this.f60519a = i7;
        this.f60520b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f60519a) {
            case 0:
                this.f60520b.setReordering(true);
                return;
            case 1:
                this.f60520b.setReordering(true);
                return;
            case 2:
                this.f60520b.f(false);
                return;
            default:
                this.f60520b.setReordering(true);
                return;
        }
    }
}
