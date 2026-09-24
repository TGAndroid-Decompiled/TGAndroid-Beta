package xh;
public final class o implements Runnable {
    public final int f46301a;
    public final v f46302b;

    public o(v vVar, int i10) {
        this.f46301a = i10;
        this.f46302b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46301a) {
            case 0:
                this.f46302b.onBackPressed();
                return;
            default:
                this.f46302b.T();
                return;
        }
    }
}
