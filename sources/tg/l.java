package tg;
public final class l implements Runnable {
    public final int f45733a;
    public final m f45734b;

    public l(m mVar, int i10) {
        this.f45733a = i10;
        this.f45734b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f45733a) {
            case 0:
                m mVar = this.f45734b;
                if (mVar.d.J == mVar) {
                    mVar.d.T = false;
                    mVar.d.U = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f45734b;
                if (mVar2.d.J == mVar2 && !mVar2.f45736b) {
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
