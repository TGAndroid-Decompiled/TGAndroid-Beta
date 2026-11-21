package vg;
public final class k implements Runnable {
    public final int f59494a;
    public final l f59495b;

    public k(l lVar, int i7) {
        this.f59494a = i7;
        this.f59495b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59494a) {
            case 0:
                l lVar = this.f59495b;
                if (lVar.d.K == lVar) {
                    lVar.d.f59500a0 = false;
                    lVar.d.f59502b0 = null;
                    lVar.d.i();
                    return;
                }
                return;
            default:
                l lVar2 = this.f59495b;
                if (lVar2.d.K == lVar2 && !lVar2.f59497b) {
                    lVar2.d.f59500a0 = true;
                    Runnable runnable = lVar2.d.f59502b0;
                    lVar2.d.f59502b0 = null;
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
