package yh;
public final class a2 implements Runnable {
    public final int f50166a;
    public final l2 f50167b;

    public a2(l2 l2Var, int i10) {
        this.f50166a = i10;
        this.f50167b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f50166a) {
            case 0:
                this.f50167b.setReordering(true);
                return;
            case 1:
                this.f50167b.setReordering(true);
                return;
            case 2:
                this.f50167b.f(false);
                return;
            default:
                this.f50167b.setReordering(true);
                return;
        }
    }
}
