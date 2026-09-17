package ug;
public final class k implements Runnable {
    public final int f47140a;
    public final n f47141b;

    public k(n nVar, int i10) {
        this.f47140a = i10;
        this.f47141b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f47140a) {
            case 0:
                this.f47141b.dismiss();
                return;
            default:
                this.f47141b.onBackPressed();
                return;
        }
    }
}
