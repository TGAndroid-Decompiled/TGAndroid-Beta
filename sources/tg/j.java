package tg;
public final class j implements Runnable {
    public final int f43464a;
    public final m f43465b;

    public j(m mVar, int i10) {
        this.f43464a = i10;
        this.f43465b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f43464a) {
            case 0:
                this.f43465b.dismiss();
                return;
            default:
                this.f43465b.onBackPressed();
                return;
        }
    }
}
