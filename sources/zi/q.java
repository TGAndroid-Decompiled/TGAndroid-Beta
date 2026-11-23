package zi;
public final class q implements Runnable {
    public final int f62252a;
    public final t f62253b;

    public q(t tVar, int i7) {
        this.f62252a = i7;
        this.f62253b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f62252a) {
            case 0:
                t tVar = this.f62253b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f62253b.c();
                return;
        }
    }
}
