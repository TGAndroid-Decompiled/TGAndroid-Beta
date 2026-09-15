package xh;
public final class c2 implements Runnable {
    public final int f45819a;
    public final n2 f45820b;

    public c2(n2 n2Var, int i10) {
        this.f45819a = i10;
        this.f45820b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f45819a) {
            case 0:
                this.f45820b.setReordering(true);
                return;
            case 1:
                this.f45820b.setReordering(true);
                return;
            case 2:
                this.f45820b.f(false);
                return;
            default:
                this.f45820b.setReordering(true);
                return;
        }
    }
}
