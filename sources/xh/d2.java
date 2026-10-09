package xh;
public final class d2 implements Runnable {
    public final int f51200a;
    public final o2 f51201b;

    public d2(o2 o2Var, int i10) {
        this.f51200a = i10;
        this.f51201b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f51200a) {
            case 0:
                this.f51201b.setReordering(true);
                return;
            case 1:
                this.f51201b.setReordering(true);
                return;
            case 2:
                this.f51201b.f(false);
                return;
            default:
                this.f51201b.setReordering(true);
                return;
        }
    }
}
