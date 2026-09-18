package xh;
public final class o implements Runnable {
    public final int f46075a;
    public final v f46076b;

    public o(v vVar, int i10) {
        this.f46075a = i10;
        this.f46076b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46075a) {
            case 0:
                this.f46076b.onBackPressed();
                return;
            default:
                this.f46076b.T();
                return;
        }
    }
}
