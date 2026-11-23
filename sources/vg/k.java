package vg;
public final class k implements Runnable {
    public final int f59583a;
    public final l f59584b;

    public k(l lVar, int i7) {
        this.f59583a = i7;
        this.f59584b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f59583a) {
            case 0:
                l lVar = this.f59584b;
                if (lVar.d.K == lVar) {
                    lVar.d.f59589a0 = false;
                    lVar.d.f59591b0 = null;
                    lVar.d.i();
                    return;
                }
                return;
            default:
                l lVar2 = this.f59584b;
                if (lVar2.d.K == lVar2 && !lVar2.f59586b) {
                    lVar2.d.f59589a0 = true;
                    Runnable runnable = lVar2.d.f59591b0;
                    lVar2.d.f59591b0 = null;
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
