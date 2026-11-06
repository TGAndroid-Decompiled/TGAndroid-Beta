package xh;
public final class k implements Runnable {
    public final int f58738a;
    public final l f58739b;
    public final int f58740c;

    public k(l lVar, int i7, int i10) {
        this.f58738a = i10;
        this.f58739b = lVar;
        this.f58740c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58738a) {
            case 0:
                l lVar = this.f58739b;
                lVar.post(new k(lVar, this.f58740c, 1));
                return;
            default:
                int i7 = this.f58740c;
                l lVar2 = this.f58739b;
                if (i7 == lVar2.h) {
                    lVar2.f58745f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
