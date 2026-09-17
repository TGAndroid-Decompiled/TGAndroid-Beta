package xh;
public final class o implements Runnable {
    public final int f46070a;
    public final v f46071b;

    public o(v vVar, int i10) {
        this.f46070a = i10;
        this.f46071b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46070a) {
            case 0:
                this.f46071b.onBackPressed();
                return;
            default:
                this.f46071b.T();
                return;
        }
    }
}
