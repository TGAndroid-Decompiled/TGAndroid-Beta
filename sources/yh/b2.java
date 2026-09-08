package yh;
public final class b2 implements Runnable {
    public final int f50240a;
    public final m2 f50241b;

    public b2(m2 m2Var, int i10) {
        this.f50240a = i10;
        this.f50241b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f50240a) {
            case 0:
                this.f50241b.setReordering(true);
                return;
            case 1:
                this.f50241b.setReordering(true);
                return;
            case 2:
                this.f50241b.f(false);
                return;
            default:
                this.f50241b.setReordering(true);
                return;
        }
    }
}
