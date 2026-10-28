package ug;
public final class l implements Runnable {
    public final int f49844a;
    public final m f49845b;

    public l(m mVar, int i10) {
        this.f49844a = i10;
        this.f49845b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f49844a) {
            case 0:
                m mVar = this.f49845b;
                if (mVar.d.J == mVar) {
                    mVar.d.W = false;
                    mVar.d.f49850a0 = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f49845b;
                if (mVar2.d.J == mVar2 && !mVar2.f49847b) {
                    mVar2.d.W = true;
                    Runnable runnable = mVar2.d.f49850a0;
                    mVar2.d.f49850a0 = null;
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
