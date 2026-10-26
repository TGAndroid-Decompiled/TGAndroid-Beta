package ug;
public final class l implements Runnable {
    public final int f49809a;
    public final m f49810b;

    public l(m mVar, int i10) {
        this.f49809a = i10;
        this.f49810b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f49809a) {
            case 0:
                m mVar = this.f49810b;
                if (mVar.d.J == mVar) {
                    mVar.d.W = false;
                    mVar.d.f49815a0 = null;
                    mVar.d.i();
                    return;
                }
                return;
            default:
                m mVar2 = this.f49810b;
                if (mVar2.d.J == mVar2 && !mVar2.f49812b) {
                    mVar2.d.W = true;
                    Runnable runnable = mVar2.d.f49815a0;
                    mVar2.d.f49815a0 = null;
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
