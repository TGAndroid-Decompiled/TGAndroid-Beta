package vg;
public final class k implements Runnable {
    public final int f58886a;
    public final l f58887b;

    public k(l lVar, int i7) {
        this.f58886a = i7;
        this.f58887b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f58886a) {
            case 0:
                l lVar = this.f58887b;
                if (lVar.d.K == lVar) {
                    lVar.d.f58892a0 = false;
                    lVar.d.f58894b0 = null;
                    lVar.d.i();
                    return;
                }
                return;
            default:
                l lVar2 = this.f58887b;
                if (lVar2.d.K == lVar2 && !lVar2.f58889b) {
                    lVar2.d.f58892a0 = true;
                    Runnable runnable = lVar2.d.f58894b0;
                    lVar2.d.f58894b0 = null;
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
