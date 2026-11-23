package zi;
public final class e0 implements Runnable {
    public final int f62123a;
    public final u0 f62124b;
    public final Exception f62125c;

    public e0(u0 u0Var, Exception exc, int i7) {
        this.f62123a = i7;
        this.f62124b = u0Var;
        this.f62125c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62123a) {
            case 0:
                this.f62124b.h(this.f62125c);
                return;
            case 1:
                this.f62124b.h(this.f62125c);
                return;
            case 2:
                this.f62124b.h(this.f62125c);
                return;
            default:
                this.f62124b.h(this.f62125c);
                return;
        }
    }
}
