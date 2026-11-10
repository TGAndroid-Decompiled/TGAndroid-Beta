package xh;
public final class k implements Runnable {
    public final int f58841a;
    public final l f58842b;
    public final int f58843c;

    public k(l lVar, int i7, int i10) {
        this.f58841a = i10;
        this.f58842b = lVar;
        this.f58843c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58841a) {
            case 0:
                l lVar = this.f58842b;
                lVar.post(new k(lVar, this.f58843c, 1));
                return;
            default:
                int i7 = this.f58843c;
                l lVar2 = this.f58842b;
                if (i7 == lVar2.h) {
                    lVar2.f58848f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
