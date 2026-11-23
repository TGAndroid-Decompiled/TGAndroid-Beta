package xh;
public final class k implements Runnable {
    public final int f60719a;
    public final l f60720b;
    public final int f60721c;

    public k(l lVar, int i7, int i10) {
        this.f60719a = i10;
        this.f60720b = lVar;
        this.f60721c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60719a) {
            case 0:
                l lVar = this.f60720b;
                lVar.post(new k(lVar, this.f60721c, 1));
                return;
            default:
                int i7 = this.f60721c;
                l lVar2 = this.f60720b;
                if (i7 == lVar2.h) {
                    lVar2.f60726f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
