package xh;
public final class k implements Runnable {
    public final int f60601a;
    public final l f60602b;
    public final int f60603c;

    public k(l lVar, int i7, int i10) {
        this.f60601a = i10;
        this.f60602b = lVar;
        this.f60603c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60601a) {
            case 0:
                l lVar = this.f60602b;
                lVar.post(new k(lVar, this.f60603c, 1));
                return;
            default:
                int i7 = this.f60603c;
                l lVar2 = this.f60602b;
                if (i7 == lVar2.h) {
                    lVar2.f60608f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
