package zh;
public final class b2 implements Runnable {
    public final int f52965a;
    public final m2 f52966b;

    public b2(m2 m2Var, int i10) {
        this.f52965a = i10;
        this.f52966b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f52965a) {
            case 0:
                this.f52966b.setReordering(true);
                return;
            case 1:
                this.f52966b.setReordering(true);
                return;
            case 2:
                this.f52966b.f(false);
                return;
            default:
                this.f52966b.setReordering(true);
                return;
        }
    }
}
