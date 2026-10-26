package zh;
public final class b2 implements Runnable {
    public final int f52907a;
    public final m2 f52908b;

    public b2(m2 m2Var, int i10) {
        this.f52907a = i10;
        this.f52908b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f52907a) {
            case 0:
                this.f52908b.setReordering(true);
                return;
            case 1:
                this.f52908b.setReordering(true);
                return;
            case 2:
                this.f52908b.f(false);
                return;
            default:
                this.f52908b.setReordering(true);
                return;
        }
    }
}
