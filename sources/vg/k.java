package vg;
public final class k implements Runnable {
    public final int f59455a;
    public final l f59456b;

    public k(l lVar, int i7) {
        this.f59455a = i7;
        this.f59456b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59455a) {
            case 0:
                l lVar = this.f59456b;
                if (lVar.d.K == lVar) {
                    lVar.d.f59461a0 = false;
                    lVar.d.f59463b0 = null;
                    lVar.d.i();
                    return;
                }
                return;
            default:
                l lVar2 = this.f59456b;
                if (lVar2.d.K == lVar2 && !lVar2.f59458b) {
                    lVar2.d.f59461a0 = true;
                    Runnable runnable = lVar2.d.f59463b0;
                    lVar2.d.f59463b0 = null;
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
