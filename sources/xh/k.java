package xh;
public final class k implements Runnable {
    public final int f60591a;
    public final l f60592b;
    public final int f60593c;

    public k(l lVar, int i7, int i10) {
        this.f60591a = i10;
        this.f60592b = lVar;
        this.f60593c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60591a) {
            case 0:
                l lVar = this.f60592b;
                lVar.post(new k(lVar, this.f60593c, 1));
                return;
            default:
                int i7 = this.f60593c;
                l lVar2 = this.f60592b;
                if (i7 == lVar2.h) {
                    lVar2.f60598f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
