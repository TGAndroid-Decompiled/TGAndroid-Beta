package tg;
public final class l implements Runnable {
    public final int f47142a;
    public final m f47143b;

    public l(m mVar, int i10) {
        this.f47142a = i10;
        this.f47143b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f47142a) {
            case 0:
                m mVar = this.f47143b;
                if (mVar.d.J == mVar) {
                    mVar.d.W = false;
                    mVar.d.f47148a0 = null;
                    mVar.d.j();
                    return;
                }
                return;
            default:
                m mVar2 = this.f47143b;
                if (mVar2.d.J == mVar2 && !mVar2.f47145b) {
                    mVar2.d.W = true;
                    Runnable runnable = mVar2.d.f47148a0;
                    mVar2.d.f47148a0 = null;
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
