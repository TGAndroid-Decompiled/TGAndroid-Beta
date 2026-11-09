package xh;
public final class k implements Runnable {
    public final int f58843a;
    public final l f58844b;
    public final int f58845c;

    public k(l lVar, int i7, int i10) {
        this.f58843a = i10;
        this.f58844b = lVar;
        this.f58845c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58843a) {
            case 0:
                l lVar = this.f58844b;
                lVar.post(new k(lVar, this.f58845c, 1));
                return;
            default:
                int i7 = this.f58845c;
                l lVar2 = this.f58844b;
                if (i7 == lVar2.h) {
                    lVar2.f58850f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
