package xh;
public final class o implements Runnable {
    public final int f46382a;
    public final v f46383b;

    public o(v vVar, int i10) {
        this.f46382a = i10;
        this.f46383b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46382a) {
            case 0:
                this.f46383b.onBackPressed();
                return;
            default:
                this.f46383b.T();
                return;
        }
    }
}
