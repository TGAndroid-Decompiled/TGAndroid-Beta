package tg;
public final class j implements Runnable {
    public final int f48438a;
    public final m f48439b;

    public j(m mVar, int i10) {
        this.f48438a = i10;
        this.f48439b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48438a) {
            case 0:
                this.f48439b.dismiss();
                return;
            default:
                this.f48439b.onBackPressed();
                return;
        }
    }
}
