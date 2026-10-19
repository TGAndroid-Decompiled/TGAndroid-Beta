package ug;
public final class j implements Runnable {
    public final int f47686a;
    public final m f47687b;

    public j(m mVar, int i10) {
        this.f47686a = i10;
        this.f47687b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47686a) {
            case 0:
                this.f47687b.dismiss();
                return;
            default:
                this.f47687b.onBackPressed();
                return;
        }
    }
}
