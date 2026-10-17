package yh;
public final class b2 implements Runnable {
    public final int f50203a;
    public final m2 f50204b;

    public b2(m2 m2Var, int i10) {
        this.f50203a = i10;
        this.f50204b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f50203a) {
            case 0:
                this.f50204b.setReordering(true);
                return;
            case 1:
                this.f50204b.setReordering(true);
                return;
            case 2:
                this.f50204b.f(false);
                return;
            default:
                this.f50204b.setReordering(true);
                return;
        }
    }
}
