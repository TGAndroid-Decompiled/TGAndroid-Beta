package tg;
public final class j implements Runnable {
    public final int f48576a;
    public final m f48577b;

    public j(m mVar, int i10) {
        this.f48576a = i10;
        this.f48577b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48576a) {
            case 0:
                this.f48577b.dismiss();
                return;
            default:
                this.f48577b.onBackPressed();
                return;
        }
    }
}
