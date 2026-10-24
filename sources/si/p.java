package si;
public final class p implements Runnable {
    public final int f47179a;
    public final t f47180b;

    public p(t tVar, int i10) {
        this.f47179a = i10;
        this.f47180b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f47179a) {
            case 0:
                t tVar = this.f47180b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f47180b.c();
                return;
        }
    }
}
