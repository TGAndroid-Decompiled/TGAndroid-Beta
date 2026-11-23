package vg;
public final class k implements Runnable {
    public final int f59498a;
    public final l f59499b;

    public k(l lVar, int i7) {
        this.f59498a = i7;
        this.f59499b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59498a) {
            case 0:
                l lVar = this.f59499b;
                if (lVar.d.K == lVar) {
                    lVar.d.f59504a0 = false;
                    lVar.d.f59506b0 = null;
                    lVar.d.i();
                    return;
                }
                return;
            default:
                l lVar2 = this.f59499b;
                if (lVar2.d.K == lVar2 && !lVar2.f59501b) {
                    lVar2.d.f59504a0 = true;
                    Runnable runnable = lVar2.d.f59506b0;
                    lVar2.d.f59506b0 = null;
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
