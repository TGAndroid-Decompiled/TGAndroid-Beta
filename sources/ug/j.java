package ug;
public final class j implements Runnable {
    public final int f47684a;
    public final m f47685b;

    public j(m mVar, int i10) {
        this.f47684a = i10;
        this.f47685b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47684a) {
            case 0:
                this.f47685b.dismiss();
                return;
            default:
                this.f47685b.onBackPressed();
                return;
        }
    }
}
