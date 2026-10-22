package si;
public final class p implements Runnable {
    public final int f46750a;
    public final t f46751b;

    public p(t tVar, int i10) {
        this.f46750a = i10;
        this.f46751b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f46750a) {
            case 0:
                t tVar = this.f46751b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f46751b.c();
                return;
        }
    }
}
