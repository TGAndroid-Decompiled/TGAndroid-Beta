package ug;
public final class k implements Runnable {
    public final int f47168a;
    public final n f47169b;

    public k(n nVar, int i10) {
        this.f47168a = i10;
        this.f47169b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f47168a) {
            case 0:
                this.f47169b.dismiss();
                return;
            default:
                this.f47169b.onBackPressed();
                return;
        }
    }
}
