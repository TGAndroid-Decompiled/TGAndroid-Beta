package tg;
public final class l implements Runnable {
    public final int f47105a;
    public final m f47106b;

    public l(m mVar, int i10) {
        this.f47105a = i10;
        this.f47106b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47105a) {
            case 0:
                m mVar = this.f47106b;
                if (mVar.d.J == mVar) {
                    mVar.d.W = false;
                    mVar.d.f47111a0 = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f47106b;
                if (mVar2.d.J == mVar2 && !mVar2.f47108b) {
                    mVar2.d.W = true;
                    Runnable runnable = mVar2.d.f47111a0;
                    mVar2.d.f47111a0 = null;
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
