package tg;
public final class j implements Runnable {
    public final int f48337a;
    public final m f48338b;

    public j(m mVar, int i10) {
        this.f48337a = i10;
        this.f48338b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48337a) {
            case 0:
                this.f48338b.dismiss();
                return;
            default:
                this.f48338b.onBackPressed();
                return;
        }
    }
}
