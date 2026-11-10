package wi;
public final class q implements Runnable {
    public final int f58142a;
    public final t f58143b;

    public q(t tVar, int i7) {
        this.f58142a = i7;
        this.f58143b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f58142a) {
            case 0:
                t tVar = this.f58143b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f58143b.c();
                return;
        }
    }
}
