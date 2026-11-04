package wi;
public final class d0 implements Runnable {
    public final int f57821a;
    public final t0 f57822b;
    public final Exception f57823c;

    public d0(t0 t0Var, Exception exc, int i3) {
        this.f57821a = i3;
        this.f57822b = t0Var;
        this.f57823c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57821a) {
            case 0:
                this.f57822b.h(this.f57823c);
                return;
            case 1:
                this.f57822b.h(this.f57823c);
                return;
            case 2:
                this.f57822b.h(this.f57823c);
                return;
            default:
                this.f57822b.h(this.f57823c);
                return;
        }
    }
}
