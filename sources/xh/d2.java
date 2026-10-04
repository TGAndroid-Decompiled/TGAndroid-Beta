package xh;
public final class d2 implements Runnable {
    public final int f49918a;
    public final o2 f49919b;

    public d2(o2 o2Var, int i10) {
        this.f49918a = i10;
        this.f49919b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f49918a) {
            case 0:
                this.f49919b.setReordering(true);
                return;
            case 1:
                this.f49919b.setReordering(true);
                return;
            case 2:
                this.f49919b.f(false);
                return;
            default:
                this.f49919b.setReordering(true);
                return;
        }
    }
}
