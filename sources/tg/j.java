package tg;
public final class j implements Runnable {
    public final int f43421a;
    public final m f43422b;

    public j(m mVar, int i10) {
        this.f43421a = i10;
        this.f43422b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43421a) {
            case 0:
                this.f43422b.dismiss();
                return;
            default:
                this.f43422b.onBackPressed();
                return;
        }
    }
}
