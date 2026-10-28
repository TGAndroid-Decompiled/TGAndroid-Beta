package vg;
public final class k implements Runnable {
    public final int f50223a;
    public final n f50224b;

    public k(n nVar, int i10) {
        this.f50223a = i10;
        this.f50224b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f50223a) {
            case 0:
                this.f50224b.dismiss();
                return;
            default:
                this.f50224b.onBackPressed();
                return;
        }
    }
}
