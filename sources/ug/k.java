package ug;
public final class k implements Runnable {
    public final int f47139a;
    public final n f47140b;

    public k(n nVar, int i10) {
        this.f47139a = i10;
        this.f47140b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f47139a) {
            case 0:
                this.f47140b.dismiss();
                return;
            default:
                this.f47140b.onBackPressed();
                return;
        }
    }
}
