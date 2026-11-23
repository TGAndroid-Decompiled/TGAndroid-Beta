package xh;
public final class k implements Runnable {
    public final int f60636a;
    public final l f60637b;
    public final int f60638c;

    public k(l lVar, int i7, int i10) {
        this.f60636a = i10;
        this.f60637b = lVar;
        this.f60638c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60636a) {
            case 0:
                l lVar = this.f60637b;
                lVar.post(new k(lVar, this.f60638c, 1));
                return;
            default:
                int i7 = this.f60638c;
                l lVar2 = this.f60637b;
                if (i7 == lVar2.h) {
                    lVar2.f60643f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
