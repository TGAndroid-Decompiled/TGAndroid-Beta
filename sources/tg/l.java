package tg;
public final class l implements Runnable {
    public final int f47104a;
    public final m f47105b;

    public l(m mVar, int i10) {
        this.f47104a = i10;
        this.f47105b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47104a) {
            case 0:
                m mVar = this.f47105b;
                if (mVar.d.J == mVar) {
                    mVar.d.W = false;
                    mVar.d.f47110a0 = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f47105b;
                if (mVar2.d.J == mVar2 && !mVar2.f47107b) {
                    mVar2.d.W = true;
                    Runnable runnable = mVar2.d.f47110a0;
                    mVar2.d.f47110a0 = null;
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
