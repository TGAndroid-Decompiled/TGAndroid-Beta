package vg;
public final class k implements Runnable {
    public final int f59456a;
    public final l f59457b;

    public k(l lVar, int i7) {
        this.f59456a = i7;
        this.f59457b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59456a) {
            case 0:
                l lVar = this.f59457b;
                if (lVar.d.K == lVar) {
                    lVar.d.f59462a0 = false;
                    lVar.d.f59464b0 = null;
                    lVar.d.i();
                    return;
                }
                return;
            default:
                l lVar2 = this.f59457b;
                if (lVar2.d.K == lVar2 && !lVar2.f59459b) {
                    lVar2.d.f59462a0 = true;
                    Runnable runnable = lVar2.d.f59464b0;
                    lVar2.d.f59464b0 = null;
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
