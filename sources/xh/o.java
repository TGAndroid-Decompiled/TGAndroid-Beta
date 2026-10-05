package xh;
public final class o implements Runnable {
    public final int f50151a;
    public final v f50152b;

    public o(v vVar, int i10) {
        this.f50151a = i10;
        this.f50152b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f50151a) {
            case 0:
                this.f50152b.onBackPressed();
                return;
            default:
                this.f50152b.R();
                return;
        }
    }
}
