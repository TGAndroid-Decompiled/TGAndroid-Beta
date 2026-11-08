package xh;
public final class k implements Runnable {
    public final int f58833a;
    public final l f58834b;
    public final int f58835c;

    public k(l lVar, int i7, int i10) {
        this.f58833a = i10;
        this.f58834b = lVar;
        this.f58835c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58833a) {
            case 0:
                l lVar = this.f58834b;
                lVar.post(new k(lVar, this.f58835c, 1));
                return;
            default:
                int i7 = this.f58835c;
                l lVar2 = this.f58834b;
                if (i7 == lVar2.h) {
                    lVar2.f58840f = false;
                    lVar2.d = true;
                    lVar2.b();
                    return;
                }
                return;
        }
    }
}
