package xh;
public final class d2 implements Runnable {
    public final int f46099a;
    public final o2 f46100b;

    public d2(o2 o2Var, int i10) {
        this.f46099a = i10;
        this.f46100b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46099a) {
            case 0:
                this.f46100b.setReordering(true);
                return;
            case 1:
                this.f46100b.setReordering(true);
                return;
            case 2:
                this.f46100b.f(false);
                return;
            default:
                this.f46100b.setReordering(true);
                return;
        }
    }
}
