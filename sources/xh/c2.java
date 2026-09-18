package xh;
public final class c2 implements Runnable {
    public final int f45847a;
    public final n2 f45848b;

    public c2(n2 n2Var, int i10) {
        this.f45847a = i10;
        this.f45848b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f45847a) {
            case 0:
                this.f45848b.setReordering(true);
                return;
            case 1:
                this.f45848b.setReordering(true);
                return;
            case 2:
                this.f45848b.f(false);
                return;
            default:
                this.f45848b.setReordering(true);
                return;
        }
    }
}
