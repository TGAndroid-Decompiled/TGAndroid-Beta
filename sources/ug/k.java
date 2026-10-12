package ug;
public final class k implements Runnable {
    public final int f46326a;
    public final n f46327b;

    public k(n nVar, int i10) {
        this.f46326a = i10;
        this.f46327b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f46326a) {
            case 0:
                this.f46327b.dismiss();
                return;
            default:
                this.f46327b.onBackPressed();
                return;
        }
    }
}
