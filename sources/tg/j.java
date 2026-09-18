package tg;
public final class j implements Runnable {
    public final int f43389a;
    public final m f43390b;

    public j(m mVar, int i10) {
        this.f43389a = i10;
        this.f43390b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43389a) {
            case 0:
                this.f43390b.dismiss();
                return;
            default:
                this.f43390b.onBackPressed();
                return;
        }
    }
}
