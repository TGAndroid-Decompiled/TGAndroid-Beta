package si;
public final class p implements Runnable {
    public final int f46747a;
    public final t f46748b;

    public p(t tVar, int i10) {
        this.f46747a = i10;
        this.f46748b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f46747a) {
            case 0:
                t tVar = this.f46748b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f46748b.c();
                return;
        }
    }
}
