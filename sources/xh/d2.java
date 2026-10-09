package xh;
public final class d2 implements Runnable {
    public final int f51202a;
    public final o2 f51203b;

    public d2(o2 o2Var, int i10) {
        this.f51202a = i10;
        this.f51203b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f51202a) {
            case 0:
                this.f51203b.setReordering(true);
                return;
            case 1:
                this.f51203b.setReordering(true);
                return;
            case 2:
                this.f51203b.f(false);
                return;
            default:
                this.f51203b.setReordering(true);
                return;
        }
    }
}
