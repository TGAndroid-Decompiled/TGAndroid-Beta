package zi;
public final class e0 implements Runnable {
    public final int f62078a;
    public final u0 f62079b;
    public final Exception f62080c;

    public e0(u0 u0Var, Exception exc, int i7) {
        this.f62078a = i7;
        this.f62079b = u0Var;
        this.f62080c = exc;
    }

    @Override
    public final void run() {
        switch (this.f62078a) {
            case 0:
                this.f62079b.h(this.f62080c);
                return;
            case 1:
                this.f62079b.h(this.f62080c);
                return;
            case 2:
                this.f62079b.h(this.f62080c);
                return;
            default:
                this.f62079b.h(this.f62080c);
                return;
        }
    }
}
