package sg;
public final class j implements Runnable {
    public final int f41935a;
    public final m f41936b;

    public j(m mVar, int i10) {
        this.f41935a = i10;
        this.f41936b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f41935a) {
            case 0:
                this.f41936b.dismiss();
                return;
            default:
                this.f41936b.onBackPressed();
                return;
        }
    }
}
