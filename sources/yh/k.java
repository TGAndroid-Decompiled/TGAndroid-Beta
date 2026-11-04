package yh;
public final class k implements Runnable {
    public final int f59551a;
    public final l f59552b;
    public final int f59553c;

    public k(l lVar, int i3, int i10) {
        this.f59551a = i10;
        this.f59552b = lVar;
        this.f59553c = i3;
    }

    @Override
    public final void run() {
        switch (this.f59551a) {
            case 0:
                l lVar = this.f59552b;
                lVar.post(new k(lVar, this.f59553c, 1));
                return;
            default:
                int i3 = this.f59553c;
                l lVar2 = this.f59552b;
                if (i3 == lVar2.h) {
                    lVar2.f59558f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
