package xh;
public final class c2 implements Runnable {
    public final int f45842a;
    public final n2 f45843b;

    public c2(n2 n2Var, int i10) {
        this.f45842a = i10;
        this.f45843b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f45842a) {
            case 0:
                this.f45843b.setReordering(true);
                return;
            case 1:
                this.f45843b.setReordering(true);
                return;
            case 2:
                this.f45843b.f(false);
                return;
            default:
                this.f45843b.setReordering(true);
                return;
        }
    }
}
