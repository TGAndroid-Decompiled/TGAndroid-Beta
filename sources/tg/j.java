package tg;
public final class j implements Runnable {
    public final int f43405a;
    public final m f43406b;

    public j(m mVar, int i10) {
        this.f43405a = i10;
        this.f43406b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43405a) {
            case 0:
                this.f43406b.dismiss();
                return;
            default:
                this.f43406b.onBackPressed();
                return;
        }
    }
}
