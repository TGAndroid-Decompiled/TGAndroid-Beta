package xh;
public final class o implements Runnable {
    public final int f46423a;
    public final v f46424b;

    public o(v vVar, int i10) {
        this.f46423a = i10;
        this.f46424b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46423a) {
            case 0:
                this.f46424b.onBackPressed();
                return;
            default:
                this.f46424b.T();
                return;
        }
    }
}
