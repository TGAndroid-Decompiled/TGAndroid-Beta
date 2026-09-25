package xh;
public final class o implements Runnable {
    public final int f46316a;
    public final v f46317b;

    public o(v vVar, int i10) {
        this.f46316a = i10;
        this.f46317b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46316a) {
            case 0:
                this.f46317b.onBackPressed();
                return;
            default:
                this.f46317b.T();
                return;
        }
    }
}
