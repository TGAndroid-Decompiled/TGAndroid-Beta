package xh;
public final class k implements Runnable {
    public final int f60590a;
    public final l f60591b;
    public final int f60592c;

    public k(l lVar, int i7, int i10) {
        this.f60590a = i10;
        this.f60591b = lVar;
        this.f60592c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60590a) {
            case 0:
                l lVar = this.f60591b;
                lVar.post(new k(lVar, this.f60592c, 1));
                return;
            default:
                int i7 = this.f60592c;
                l lVar2 = this.f60591b;
                if (i7 == lVar2.h) {
                    lVar2.f60597f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
