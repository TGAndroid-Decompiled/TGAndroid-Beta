package tg;
public final class j implements Runnable {
    public final int f43454a;
    public final m f43455b;

    public j(m mVar, int i10) {
        this.f43454a = i10;
        this.f43455b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43454a) {
            case 0:
                this.f43455b.dismiss();
                return;
            default:
                this.f43455b.onBackPressed();
                return;
        }
    }
}
