package ug;
public final class j implements Runnable {
    public final int f47694a;
    public final m f47695b;

    public j(m mVar, int i10) {
        this.f47694a = i10;
        this.f47695b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47694a) {
            case 0:
                this.f47695b.dismiss();
                return;
            default:
                this.f47695b.onBackPressed();
                return;
        }
    }
}
