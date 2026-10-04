package tg;
public final class j implements Runnable {
    public final int f47029a;
    public final m f47030b;

    public j(m mVar, int i10) {
        this.f47029a = i10;
        this.f47030b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47029a) {
            case 0:
                this.f47030b.dismiss();
                return;
            default:
                this.f47030b.onBackPressed();
                return;
        }
    }
}
