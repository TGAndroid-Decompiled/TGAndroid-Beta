package tg;
public final class j implements Runnable {
    public final int f43418a;
    public final m f43419b;

    public j(m mVar, int i10) {
        this.f43418a = i10;
        this.f43419b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43418a) {
            case 0:
                this.f43419b.dismiss();
                return;
            default:
                this.f43419b.onBackPressed();
                return;
        }
    }
}
