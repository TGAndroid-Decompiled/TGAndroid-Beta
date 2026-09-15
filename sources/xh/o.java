package xh;
public final class o implements Runnable {
    public final int f46047a;
    public final v f46048b;

    public o(v vVar, int i10) {
        this.f46047a = i10;
        this.f46048b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46047a) {
            case 0:
                this.f46048b.onBackPressed();
                return;
            default:
                this.f46048b.T();
                return;
        }
    }
}
