package xh;
public final class o implements Runnable {
    public final int f46356a;
    public final v f46357b;

    public o(v vVar, int i10) {
        this.f46356a = i10;
        this.f46357b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46356a) {
            case 0:
                this.f46357b.onBackPressed();
                return;
            default:
                this.f46357b.T();
                return;
        }
    }
}
