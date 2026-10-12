package tg;
public final class j implements Runnable {
    public final int f48545a;
    public final m f48546b;

    public j(m mVar, int i10) {
        this.f48545a = i10;
        this.f48546b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48545a) {
            case 0:
                this.f48546b.dismiss();
                return;
            default:
                this.f48546b.onBackPressed();
                return;
        }
    }
}
