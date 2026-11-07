package xh;
public final class k implements Runnable {
    public final int f58744a;
    public final l f58745b;
    public final int f58746c;

    public k(l lVar, int i7, int i10) {
        this.f58744a = i10;
        this.f58745b = lVar;
        this.f58746c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58744a) {
            case 0:
                l lVar = this.f58745b;
                lVar.post(new k(lVar, this.f58746c, 1));
                return;
            default:
                int i7 = this.f58746c;
                l lVar2 = this.f58745b;
                if (i7 == lVar2.h) {
                    lVar2.f58751f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
