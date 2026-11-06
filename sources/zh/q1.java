package zh;
public final class q1 implements Runnable {
    public final int f60393a;
    public final a2 f60394b;

    public q1(a2 a2Var, int i7) {
        this.f60393a = i7;
        this.f60394b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f60393a) {
            case 0:
                this.f60394b.setReordering(true);
                return;
            case 1:
                this.f60394b.setReordering(true);
                return;
            case 2:
                this.f60394b.f(false);
                return;
            default:
                this.f60394b.setReordering(true);
                return;
        }
    }
}
