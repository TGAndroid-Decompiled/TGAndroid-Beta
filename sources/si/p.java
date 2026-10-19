package si;
public final class p implements Runnable {
    public final int f46742a;
    public final t f46743b;

    public p(t tVar, int i10) {
        this.f46742a = i10;
        this.f46743b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f46742a) {
            case 0:
                t tVar = this.f46743b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f46743b.c();
                return;
        }
    }
}
