package vg;
public final class l implements Runnable {
    public final int f59463a;
    public final m f59464b;

    public l(m mVar, int i7) {
        this.f59463a = i7;
        this.f59464b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f59463a) {
            case 0:
                m mVar = this.f59464b;
                if (mVar.d.K == mVar) {
                    mVar.d.f59469a0 = false;
                    mVar.d.f59471b0 = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f59464b;
                if (mVar2.d.K == mVar2 && !mVar2.f59466b) {
                    mVar2.d.f59469a0 = true;
                    Runnable runnable = mVar2.d.f59471b0;
                    mVar2.d.f59471b0 = null;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
