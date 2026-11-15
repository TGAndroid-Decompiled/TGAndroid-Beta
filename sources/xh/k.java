package xh;
public final class k implements Runnable {
    public final int f60025a;
    public final l f60026b;
    public final int f60027c;

    public k(l lVar, int i7, int i10) {
        this.f60025a = i10;
        this.f60026b = lVar;
        this.f60027c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60025a) {
            case 0:
                l lVar = this.f60026b;
                lVar.post(new k(lVar, this.f60027c, 1));
                return;
            default:
                int i7 = this.f60027c;
                l lVar2 = this.f60026b;
                if (i7 == lVar2.h) {
                    lVar2.f60032f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
