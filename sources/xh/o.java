package xh;
public final class o implements Runnable {
    public final int f46315a;
    public final v f46316b;

    public o(v vVar, int i10) {
        this.f46315a = i10;
        this.f46316b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46315a) {
            case 0:
                this.f46316b.onBackPressed();
                return;
            default:
                this.f46316b.T();
                return;
        }
    }
}
