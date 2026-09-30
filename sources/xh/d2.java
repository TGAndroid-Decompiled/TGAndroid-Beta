package xh;
public final class d2 implements Runnable {
    public final int f46221a;
    public final o2 f46222b;

    public d2(o2 o2Var, int i10) {
        this.f46221a = i10;
        this.f46222b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46221a) {
            case 0:
                this.f46222b.setReordering(true);
                return;
            case 1:
                this.f46222b.setReordering(true);
                return;
            case 2:
                this.f46222b.f(false);
                return;
            default:
                this.f46222b.setReordering(true);
                return;
        }
    }
}
