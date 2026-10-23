package si;
public final class p implements Runnable {
    public final int f47180a;
    public final t f47181b;

    public p(t tVar, int i10) {
        this.f47180a = i10;
        this.f47181b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f47180a) {
            case 0:
                t tVar = this.f47181b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f47181b.c();
                return;
        }
    }
}
