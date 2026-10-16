package ug;
public final class k implements Runnable {
    public final int f46325a;
    public final n f46326b;

    public k(n nVar, int i10) {
        this.f46325a = i10;
        this.f46326b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f46325a) {
            case 0:
                this.f46326b.dismiss();
                return;
            default:
                this.f46326b.onBackPressed();
                return;
        }
    }
}
