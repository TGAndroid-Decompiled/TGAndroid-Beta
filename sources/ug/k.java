package ug;
public final class k implements Runnable {
    public final int f47167a;
    public final n f47168b;

    public k(n nVar, int i10) {
        this.f47167a = i10;
        this.f47168b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f47167a) {
            case 0:
                this.f47168b.dismiss();
                return;
            default:
                this.f47168b.onBackPressed();
                return;
        }
    }
}
