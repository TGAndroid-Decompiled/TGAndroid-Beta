package zi;
public final class q implements Runnable {
    public final int f62242a;
    public final t f62243b;

    public q(t tVar, int i7) {
        this.f62242a = i7;
        this.f62243b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f62242a) {
            case 0:
                t tVar = this.f62243b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f62243b.c();
                return;
        }
    }
}
