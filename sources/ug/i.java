package ug;
public final class i implements Runnable {
    public final int f48128a;
    public final l f48129b;

    public i(l lVar, int i10) {
        this.f48128a = i10;
        this.f48129b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f48128a) {
            case 0:
                this.f48129b.dismiss();
                return;
            default:
                this.f48129b.onBackPressed();
                return;
        }
    }
}
