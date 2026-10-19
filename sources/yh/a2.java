package yh;
public final class a2 implements Runnable {
    public final int f50167a;
    public final l2 f50168b;

    public a2(l2 l2Var, int i10) {
        this.f50167a = i10;
        this.f50168b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f50167a) {
            case 0:
                this.f50168b.setReordering(true);
                return;
            case 1:
                this.f50168b.setReordering(true);
                return;
            case 2:
                this.f50168b.f(false);
                return;
            default:
                this.f50168b.setReordering(true);
                return;
        }
    }
}
