package sg;
public final class l implements Runnable {
    public final int f48310a;
    public final m f48311b;

    public l(m mVar, int i10) {
        this.f48310a = i10;
        this.f48311b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48310a) {
            case 0:
                m mVar = this.f48311b;
                if (mVar.d.J == mVar) {
                    mVar.d.T = false;
                    mVar.d.U = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f48311b;
                if (mVar2.d.J == mVar2 && !mVar2.f48313b) {
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
