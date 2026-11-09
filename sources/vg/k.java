package vg;
public final class k implements Runnable {
    public final int f57417a;
    public final l f57418b;

    public k(l lVar, int i7) {
        this.f57417a = i7;
        this.f57418b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57417a) {
            case 0:
                l lVar = this.f57418b;
                if (lVar.d.J == lVar) {
                    lVar.d.W = false;
                    lVar.d.f57423a0 = null;
                    lVar.d.i();
                    return;
                }
                return;
            default:
                l lVar2 = this.f57418b;
                if (lVar2.d.J == lVar2 && !lVar2.f57420b) {
                    lVar2.d.W = true;
                    Runnable runnable = lVar2.d.f57423a0;
                    lVar2.d.f57423a0 = null;
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
