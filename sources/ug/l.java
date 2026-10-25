package ug;
public final class l implements Runnable {
    public final int f49806a;
    public final m f49807b;

    public l(m mVar, int i10) {
        this.f49806a = i10;
        this.f49807b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f49806a) {
            case 0:
                m mVar = this.f49807b;
                if (mVar.d.J == mVar) {
                    mVar.d.W = false;
                    mVar.d.f49812a0 = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f49807b;
                if (mVar2.d.J == mVar2 && !mVar2.f49809b) {
                    mVar2.d.W = true;
                    Runnable runnable = mVar2.d.f49812a0;
                    mVar2.d.f49812a0 = null;
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
