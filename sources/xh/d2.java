package xh;
public final class d2 implements Runnable {
    public final int f51323a;
    public final o2 f51324b;

    public d2(o2 o2Var, int i10) {
        this.f51323a = i10;
        this.f51324b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f51323a) {
            case 0:
                this.f51324b.setReordering(true);
                return;
            case 1:
                this.f51324b.setReordering(true);
                return;
            case 2:
                this.f51324b.f(false);
                return;
            default:
                this.f51324b.setReordering(true);
                return;
        }
    }
}
