package wi;
public final class q implements Runnable {
    public final int f58138a;
    public final t f58139b;

    public q(t tVar, int i7) {
        this.f58138a = i7;
        this.f58139b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f58138a) {
            case 0:
                t tVar = this.f58139b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f58139b.c();
                return;
        }
    }
}
