package wi;
public final class q implements Runnable {
    public final int f58129a;
    public final t f58130b;

    public q(t tVar, int i7) {
        this.f58129a = i7;
        this.f58130b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f58129a) {
            case 0:
                t tVar = this.f58130b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f58130b.c();
                return;
        }
    }
}
