package ug;
public final class j implements Runnable {
    public final int f47691a;
    public final m f47692b;

    public j(m mVar, int i10) {
        this.f47691a = i10;
        this.f47692b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47691a) {
            case 0:
                this.f47692b.dismiss();
                return;
            default:
                this.f47692b.onBackPressed();
                return;
        }
    }
}
