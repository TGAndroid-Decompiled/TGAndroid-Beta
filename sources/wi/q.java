package wi;
public final class q implements Runnable {
    public final int f58128a;
    public final t f58129b;

    public q(t tVar, int i7) {
        this.f58128a = i7;
        this.f58129b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f58128a) {
            case 0:
                t tVar = this.f58129b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f58129b.c();
                return;
        }
    }
}
