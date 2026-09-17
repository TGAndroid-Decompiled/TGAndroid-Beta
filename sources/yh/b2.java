package yh;
public final class b2 implements Runnable {
    public final int f50241a;
    public final m2 f50242b;

    public b2(m2 m2Var, int i10) {
        this.f50241a = i10;
        this.f50242b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f50241a) {
            case 0:
                this.f50242b.setReordering(true);
                return;
            case 1:
                this.f50242b.setReordering(true);
                return;
            case 2:
                this.f50242b.f(false);
                return;
            default:
                this.f50242b.setReordering(true);
                return;
        }
    }
}
