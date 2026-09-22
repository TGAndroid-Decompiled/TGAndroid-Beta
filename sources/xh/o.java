package xh;
public final class o implements Runnable {
    public final int f46043a;
    public final v f46044b;

    public o(v vVar, int i10) {
        this.f46043a = i10;
        this.f46044b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46043a) {
            case 0:
                this.f46044b.onBackPressed();
                return;
            default:
                this.f46044b.T();
                return;
        }
    }
}
