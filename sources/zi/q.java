package zi;
public final class q implements Runnable {
    public final int f62287a;
    public final t f62288b;

    public q(t tVar, int i7) {
        this.f62287a = i7;
        this.f62288b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f62287a) {
            case 0:
                t tVar = this.f62288b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f62288b.c();
                return;
        }
    }
}
