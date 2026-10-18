package tg;
public final class l implements Runnable {
    public final int f47092a;
    public final m f47093b;

    public l(m mVar, int i10) {
        this.f47092a = i10;
        this.f47093b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47092a) {
            case 0:
                m mVar = this.f47093b;
                if (mVar.d.J == mVar) {
                    mVar.d.W = false;
                    mVar.d.f47098a0 = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f47093b;
                if (mVar2.d.J == mVar2 && !mVar2.f47095b) {
                    mVar2.d.W = true;
                    Runnable runnable = mVar2.d.f47098a0;
                    mVar2.d.f47098a0 = null;
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
