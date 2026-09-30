package tg;
public final class j implements Runnable {
    public final int f43527a;
    public final m f43528b;

    public j(m mVar, int i10) {
        this.f43527a = i10;
        this.f43528b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43527a) {
            case 0:
                this.f43528b.dismiss();
                return;
            default:
                this.f43528b.onBackPressed();
                return;
        }
    }
}
