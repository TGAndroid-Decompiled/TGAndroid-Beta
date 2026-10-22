package yh;
public final class o implements Runnable {
    public final int f50425a;
    public final v f50426b;

    public o(v vVar, int i10) {
        this.f50425a = i10;
        this.f50426b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50425a) {
            case 0:
                this.f50426b.onBackPressed();
                return;
            default:
                this.f50426b.U();
                return;
        }
    }
}
