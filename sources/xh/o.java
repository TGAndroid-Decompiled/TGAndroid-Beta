package xh;
public final class o implements Runnable {
    public final int f46288a;
    public final v f46289b;

    public o(v vVar, int i10) {
        this.f46288a = i10;
        this.f46289b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46288a) {
            case 0:
                this.f46289b.onBackPressed();
                return;
            default:
                this.f46289b.T();
                return;
        }
    }
}
