package yh;
public final class o implements Runnable {
    public final int f50464a;
    public final v f50465b;

    public o(v vVar, int i10) {
        this.f50464a = i10;
        this.f50465b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50464a) {
            case 0:
                this.f50465b.onBackPressed();
                return;
            default:
                this.f50465b.T();
                return;
        }
    }
}
