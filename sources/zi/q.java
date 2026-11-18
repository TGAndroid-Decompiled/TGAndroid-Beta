package zi;
public final class q implements Runnable {
    public final int f62241a;
    public final t f62242b;

    public q(t tVar, int i7) {
        this.f62241a = i7;
        this.f62242b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f62241a) {
            case 0:
                t tVar = this.f62242b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f62242b.c();
                return;
        }
    }
}
