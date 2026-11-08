package xh;
public final class k implements Runnable {
    public final int f58834a;
    public final l f58835b;
    public final int f58836c;

    public k(l lVar, int i7, int i10) {
        this.f58834a = i10;
        this.f58835b = lVar;
        this.f58836c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58834a) {
            case 0:
                l lVar = this.f58835b;
                lVar.post(new k(lVar, this.f58836c, 1));
                return;
            default:
                int i7 = this.f58836c;
                l lVar2 = this.f58835b;
                if (i7 == lVar2.h) {
                    lVar2.f58841f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
