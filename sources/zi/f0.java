package zi;
public final class f0 implements Runnable {
    public final int f61514a;
    public final v0 f61515b;
    public final Exception f61516c;

    public f0(v0 v0Var, Exception exc, int i7) {
        this.f61514a = i7;
        this.f61515b = v0Var;
        this.f61516c = exc;
    }

    @Override
    public final void run() {
        switch (this.f61514a) {
            case 0:
                this.f61515b.h(this.f61516c);
                return;
            case 1:
                this.f61515b.h(this.f61516c);
                return;
            case 2:
                this.f61515b.h(this.f61516c);
                return;
            default:
                this.f61515b.h(this.f61516c);
                return;
        }
    }
}
