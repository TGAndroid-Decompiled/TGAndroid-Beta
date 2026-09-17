package yh;
public final class b2 implements Runnable {
    public final int f50212a;
    public final m2 f50213b;

    public b2(m2 m2Var, int i10) {
        this.f50212a = i10;
        this.f50213b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f50212a) {
            case 0:
                this.f50213b.setReordering(true);
                return;
            case 1:
                this.f50213b.setReordering(true);
                return;
            case 2:
                this.f50213b.f(false);
                return;
            default:
                this.f50213b.setReordering(true);
                return;
        }
    }
}
