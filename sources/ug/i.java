package ug;
public final class i implements Runnable {
    public final int f48127a;
    public final l f48128b;

    public i(l lVar, int i10) {
        this.f48127a = i10;
        this.f48128b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f48127a) {
            case 0:
                this.f48128b.dismiss();
                return;
            default:
                this.f48128b.onBackPressed();
                return;
        }
    }
}
