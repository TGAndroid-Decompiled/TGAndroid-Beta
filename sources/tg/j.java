package tg;
public final class j implements Runnable {
    public final int f43419a;
    public final m f43420b;

    public j(m mVar, int i10) {
        this.f43419a = i10;
        this.f43420b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43419a) {
            case 0:
                this.f43420b.dismiss();
                return;
            default:
                this.f43420b.onBackPressed();
                return;
        }
    }
}
