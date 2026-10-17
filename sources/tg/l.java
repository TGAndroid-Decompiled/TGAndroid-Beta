package tg;
public final class l implements Runnable {
    public final int f47120a;
    public final m f47121b;

    public l(m mVar, int i10) {
        this.f47120a = i10;
        this.f47121b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47120a) {
            case 0:
                m mVar = this.f47121b;
                if (mVar.d.J == mVar) {
                    mVar.d.T = false;
                    mVar.d.U = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f47121b;
                if (mVar2.d.J == mVar2 && !mVar2.f47123b) {
                    mVar2.d.T = true;
                    Runnable runnable = mVar2.d.U;
                    mVar2.d.U = null;
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
