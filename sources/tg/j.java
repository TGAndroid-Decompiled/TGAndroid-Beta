package tg;
public final class j implements Runnable {
    public final int f48335a;
    public final m f48336b;

    public j(m mVar, int i10) {
        this.f48335a = i10;
        this.f48336b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48335a) {
            case 0:
                this.f48336b.dismiss();
                return;
            default:
                this.f48336b.onBackPressed();
                return;
        }
    }
}
