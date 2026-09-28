package tg;
public final class j implements Runnable {
    public final int f43420a;
    public final m f43421b;

    public j(m mVar, int i10) {
        this.f43420a = i10;
        this.f43421b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43420a) {
            case 0:
                this.f43421b.dismiss();
                return;
            default:
                this.f43421b.onBackPressed();
                return;
        }
    }
}
