package zh;
public final class p1 implements Runnable {
    public final int f60501a;
    public final z1 f60502b;

    public p1(z1 z1Var, int i7) {
        this.f60501a = i7;
        this.f60502b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f60501a) {
            case 0:
                this.f60502b.setReordering(true);
                return;
            case 1:
                this.f60502b.setReordering(true);
                return;
            case 2:
                this.f60502b.f(false);
                return;
            default:
                this.f60502b.setReordering(true);
                return;
        }
    }
}
