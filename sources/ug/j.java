package ug;
public final class j implements Runnable {
    public final int f47731a;
    public final m f47732b;

    public j(m mVar, int i10) {
        this.f47731a = i10;
        this.f47732b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47731a) {
            case 0:
                this.f47732b.dismiss();
                return;
            default:
                this.f47732b.onBackPressed();
                return;
        }
    }
}
