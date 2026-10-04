package xh;
public final class d2 implements Runnable {
    public final int f49926a;
    public final o2 f49927b;

    public d2(o2 o2Var, int i10) {
        this.f49926a = i10;
        this.f49927b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f49926a) {
            case 0:
                this.f49927b.setReordering(true);
                return;
            case 1:
                this.f49927b.setReordering(true);
                return;
            case 2:
                this.f49927b.f(false);
                return;
            default:
                this.f49927b.setReordering(true);
                return;
        }
    }
}
