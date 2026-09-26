package xh;
public final class d2 implements Runnable {
    public final int f46112a;
    public final o2 f46113b;

    public d2(o2 o2Var, int i10) {
        this.f46112a = i10;
        this.f46113b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46112a) {
            case 0:
                this.f46113b.setReordering(true);
                return;
            case 1:
                this.f46113b.setReordering(true);
                return;
            case 2:
                this.f46113b.f(false);
                return;
            default:
                this.f46113b.setReordering(true);
                return;
        }
    }
}
