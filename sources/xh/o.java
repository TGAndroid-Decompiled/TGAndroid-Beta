package xh;
public final class o implements Runnable {
    public final int f46314a;
    public final v f46315b;

    public o(v vVar, int i10) {
        this.f46314a = i10;
        this.f46315b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46314a) {
            case 0:
                this.f46315b.onBackPressed();
                return;
            default:
                this.f46315b.T();
                return;
        }
    }
}
