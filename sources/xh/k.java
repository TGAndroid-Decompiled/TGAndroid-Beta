package xh;
public final class k implements Runnable {
    public final int f58739a;
    public final l f58740b;
    public final int f58741c;

    public k(l lVar, int i7, int i10) {
        this.f58739a = i10;
        this.f58740b = lVar;
        this.f58741c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58739a) {
            case 0:
                l lVar = this.f58740b;
                lVar.post(new k(lVar, this.f58741c, 1));
                return;
            default:
                int i7 = this.f58741c;
                l lVar2 = this.f58740b;
                if (i7 == lVar2.h) {
                    lVar2.f58746f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
