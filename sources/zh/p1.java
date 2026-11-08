package zh;
public final class p1 implements Runnable {
    public final int f60500a;
    public final z1 f60501b;

    public p1(z1 z1Var, int i7) {
        this.f60500a = i7;
        this.f60501b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f60500a) {
            case 0:
                this.f60501b.setReordering(true);
                return;
            case 1:
                this.f60501b.setReordering(true);
                return;
            case 2:
                this.f60501b.f(false);
                return;
            default:
                this.f60501b.setReordering(true);
                return;
        }
    }
}
