package si;
public final class p implements Runnable {
    public final int f46751a;
    public final t f46752b;

    public p(t tVar, int i10) {
        this.f46751a = i10;
        this.f46752b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f46751a) {
            case 0:
                t tVar = this.f46752b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f46752b.c();
                return;
        }
    }
}
