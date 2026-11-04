package wg;
public final class k implements Runnable {
    public final int f57659a;
    public final l f57660b;

    public k(l lVar, int i3) {
        this.f57659a = i3;
        this.f57660b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57659a) {
            case 0:
                l lVar = this.f57660b;
                if (lVar.d.K == lVar) {
                    lVar.d.f57665a0 = false;
                    lVar.d.f57667b0 = null;
                    lVar.d.i();
                    return;
                }
                return;
            default:
                l lVar2 = this.f57660b;
                if (lVar2.d.K == lVar2 && !lVar2.f57662b) {
                    lVar2.d.f57665a0 = true;
                    Runnable runnable = lVar2.d.f57667b0;
                    lVar2.d.f57667b0 = null;
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
