package tg;
public final class j implements Runnable {
    public final int f47022a;
    public final m f47023b;

    public j(m mVar, int i10) {
        this.f47022a = i10;
        this.f47023b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47022a) {
            case 0:
                this.f47023b.dismiss();
                return;
            default:
                this.f47023b.onBackPressed();
                return;
        }
    }
}
