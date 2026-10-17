package ug;
public final class i implements Runnable {
    public final int f47703a;
    public final l f47704b;

    public i(l lVar, int i10) {
        this.f47703a = i10;
        this.f47704b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f47703a) {
            case 0:
                this.f47704b.dismiss();
                return;
            default:
                this.f47704b.onBackPressed();
                return;
        }
    }
}
