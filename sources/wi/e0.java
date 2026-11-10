package wi;
public final class e0 implements Runnable {
    public final int f57975a;
    public final t0 f57976b;
    public final Exception f57977c;

    public e0(t0 t0Var, Exception exc, int i7) {
        this.f57975a = i7;
        this.f57976b = t0Var;
        this.f57977c = exc;
    }

    @Override
    public final void run() {
        switch (this.f57975a) {
            case 0:
                this.f57976b.h(this.f57977c);
                return;
            case 1:
                this.f57976b.h(this.f57977c);
                return;
            case 2:
                this.f57976b.h(this.f57977c);
                return;
            default:
                this.f57976b.h(this.f57977c);
                return;
        }
    }
}
