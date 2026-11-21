package zi;
public final class q implements Runnable {
    public final int f62283a;
    public final t f62284b;

    public q(t tVar, int i7) {
        this.f62283a = i7;
        this.f62284b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f62283a) {
            case 0:
                t tVar = this.f62284b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f62284b.c();
                return;
        }
    }
}
