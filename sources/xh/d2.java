package xh;
public final class d2 implements Runnable {
    public final int f49917a;
    public final o2 f49918b;

    public d2(o2 o2Var, int i10) {
        this.f49917a = i10;
        this.f49918b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f49917a) {
            case 0:
                this.f49918b.setReordering(true);
                return;
            case 1:
                this.f49918b.setReordering(true);
                return;
            case 2:
                this.f49918b.f(false);
                return;
            default:
                this.f49918b.setReordering(true);
                return;
        }
    }
}
