package vg;
public final class k implements Runnable {
    public final int f50188a;
    public final n f50189b;

    public k(n nVar, int i10) {
        this.f50188a = i10;
        this.f50189b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f50188a) {
            case 0:
                this.f50189b.dismiss();
                return;
            default:
                this.f50189b.onBackPressed();
                return;
        }
    }
}
