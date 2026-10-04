package tg;
public final class j implements Runnable {
    public final int f47021a;
    public final m f47022b;

    public j(m mVar, int i10) {
        this.f47021a = i10;
        this.f47022b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47021a) {
            case 0:
                this.f47022b.dismiss();
                return;
            default:
                this.f47022b.onBackPressed();
                return;
        }
    }
}
