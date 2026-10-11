package tg;
public final class j implements Runnable {
    public final int f48404a;
    public final m f48405b;

    public j(m mVar, int i10) {
        this.f48404a = i10;
        this.f48405b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48404a) {
            case 0:
                this.f48405b.dismiss();
                return;
            default:
                this.f48405b.onBackPressed();
                return;
        }
    }
}
