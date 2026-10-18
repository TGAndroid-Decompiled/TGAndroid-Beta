package si;
public final class p implements Runnable {
    public final int f46740a;
    public final t f46741b;

    public p(t tVar, int i10) {
        this.f46740a = i10;
        this.f46741b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f46740a) {
            case 0:
                t tVar = this.f46741b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f46741b.c();
                return;
        }
    }
}
