package zi;
public final class q implements Runnable {
    public final int f62372a;
    public final t f62373b;

    public q(t tVar, int i7) {
        this.f62372a = i7;
        this.f62373b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f62372a) {
            case 0:
                t tVar = this.f62373b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f62373b.c();
                return;
        }
    }
}
