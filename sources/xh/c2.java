package xh;
public final class c2 implements Runnable {
    public final int f45815a;
    public final n2 f45816b;

    public c2(n2 n2Var, int i10) {
        this.f45815a = i10;
        this.f45816b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f45815a) {
            case 0:
                this.f45816b.setReordering(true);
                return;
            case 1:
                this.f45816b.setReordering(true);
                return;
            case 2:
                this.f45816b.f(false);
                return;
            default:
                this.f45816b.setReordering(true);
                return;
        }
    }
}
