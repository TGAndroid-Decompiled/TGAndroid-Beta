package yh;
public final class o implements Runnable {
    public final int f50422a;
    public final v f50423b;

    public o(v vVar, int i10) {
        this.f50422a = i10;
        this.f50423b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50422a) {
            case 0:
                this.f50423b.onBackPressed();
                return;
            default:
                this.f50423b.U();
                return;
        }
    }
}
