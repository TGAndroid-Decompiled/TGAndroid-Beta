package xh;
public final class o implements Runnable {
    public final int f46335a;
    public final v f46336b;

    public o(v vVar, int i10) {
        this.f46335a = i10;
        this.f46336b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46335a) {
            case 0:
                this.f46336b.onBackPressed();
                return;
            default:
                this.f46336b.T();
                return;
        }
    }
}
