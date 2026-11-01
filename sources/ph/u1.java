package ph;
public final class u1 implements Runnable {
    public final int f45328a;
    public final f2 f45329b;

    public u1(f2 f2Var, int i10) {
        this.f45328a = i10;
        this.f45329b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f45328a) {
            case 0:
                this.f45329b.setReordering(true);
                return;
            case 1:
                this.f45329b.setReordering(true);
                return;
            case 2:
                this.f45329b.f(false);
                return;
            default:
                this.f45329b.setReordering(true);
                return;
        }
    }
}
