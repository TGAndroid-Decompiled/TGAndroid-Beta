package zh;
public final class p1 implements Runnable {
    public final int f60510a;
    public final z1 f60511b;

    public p1(z1 z1Var, int i7) {
        this.f60510a = i7;
        this.f60511b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f60510a) {
            case 0:
                this.f60511b.setReordering(true);
                return;
            case 1:
                this.f60511b.setReordering(true);
                return;
            case 2:
                this.f60511b.f(false);
                return;
            default:
                this.f60511b.setReordering(true);
                return;
        }
    }
}
