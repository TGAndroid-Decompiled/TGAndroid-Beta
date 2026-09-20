package tg;
public final class j implements Runnable {
    public final int f43433a;
    public final m f43434b;

    public j(m mVar, int i10) {
        this.f43433a = i10;
        this.f43434b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43433a) {
            case 0:
                this.f43434b.dismiss();
                return;
            default:
                this.f43434b.onBackPressed();
                return;
        }
    }
}
