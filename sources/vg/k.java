package vg;
public final class k implements Runnable {
    public final int f57288a;
    public final l f57289b;

    public k(l lVar, int i7) {
        this.f57288a = i7;
        this.f57289b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f57288a) {
            case 0:
                l lVar = this.f57289b;
                if (lVar.d.J == lVar) {
                    lVar.d.W = false;
                    lVar.d.f57294a0 = null;
                    lVar.d.i();
                    return;
                }
                return;
            default:
                l lVar2 = this.f57289b;
                if (lVar2.d.J == lVar2 && !lVar2.f57291b) {
                    lVar2.d.W = true;
                    Runnable runnable = lVar2.d.f57294a0;
                    lVar2.d.f57294a0 = null;
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
