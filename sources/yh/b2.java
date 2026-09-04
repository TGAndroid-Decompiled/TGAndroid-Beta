package yh;
public final class b2 implements Runnable {
    public final int f50211a;
    public final m2 f50212b;

    public b2(m2 m2Var, int i10) {
        this.f50211a = i10;
        this.f50212b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f50211a) {
            case 0:
                this.f50212b.setReordering(true);
                return;
            case 1:
                this.f50212b.setReordering(true);
                return;
            case 2:
                this.f50212b.f(false);
                return;
            default:
                this.f50212b.setReordering(true);
                return;
        }
    }
}
