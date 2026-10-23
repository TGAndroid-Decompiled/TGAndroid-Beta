package ug;
public final class j implements Runnable {
    public final int f47695a;
    public final m f47696b;

    public j(m mVar, int i10) {
        this.f47695a = i10;
        this.f47696b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47695a) {
            case 0:
                this.f47696b.dismiss();
                return;
            default:
                this.f47696b.onBackPressed();
                return;
        }
    }
}
