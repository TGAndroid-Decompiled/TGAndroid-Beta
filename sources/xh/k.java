package xh;
public final class k implements Runnable {
    public final int f60632a;
    public final l f60633b;
    public final int f60634c;

    public k(l lVar, int i7, int i10) {
        this.f60632a = i10;
        this.f60633b = lVar;
        this.f60634c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60632a) {
            case 0:
                l lVar = this.f60633b;
                lVar.post(new k(lVar, this.f60634c, 1));
                return;
            default:
                int i7 = this.f60634c;
                l lVar2 = this.f60633b;
                if (i7 == lVar2.h) {
                    lVar2.f60639f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
