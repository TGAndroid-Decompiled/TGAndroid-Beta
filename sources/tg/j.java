package tg;
public final class j implements Runnable {
    public final int f48381a;
    public final m f48382b;

    public j(m mVar, int i10) {
        this.f48381a = i10;
        this.f48382b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48381a) {
            case 0:
                this.f48382b.dismiss();
                return;
            default:
                this.f48382b.onBackPressed();
                return;
        }
    }
}
