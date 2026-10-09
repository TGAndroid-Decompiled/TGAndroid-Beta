package sg;
public final class l implements Runnable {
    public final int f48069a;
    public final m f48070b;

    public l(m mVar, int i10) {
        this.f48069a = i10;
        this.f48070b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48069a) {
            case 0:
                m mVar = this.f48070b;
                if (mVar.d.J == mVar) {
                    mVar.d.T = false;
                    mVar.d.U = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f48070b;
                if (mVar2.d.J == mVar2 && !mVar2.f48072b) {
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
