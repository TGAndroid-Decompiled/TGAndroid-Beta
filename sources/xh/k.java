package xh;
public final class k implements Runnable {
    public final int f58714a;
    public final l f58715b;
    public final int f58716c;

    public k(l lVar, int i7, int i10) {
        this.f58714a = i10;
        this.f58715b = lVar;
        this.f58716c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58714a) {
            case 0:
                l lVar = this.f58715b;
                lVar.post(new k(lVar, this.f58716c, 1));
                return;
            default:
                int i7 = this.f58716c;
                l lVar2 = this.f58715b;
                if (i7 == lVar2.h) {
                    lVar2.f58721f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
