package tg;
public final class j implements Runnable {
    public final int f47036a;
    public final m f47037b;

    public j(m mVar, int i10) {
        this.f47036a = i10;
        this.f47037b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47036a) {
            case 0:
                this.f47037b.dismiss();
                return;
            default:
                this.f47037b.onBackPressed();
                return;
        }
    }
}
