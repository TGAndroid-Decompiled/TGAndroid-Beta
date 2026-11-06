package wi;
public final class o implements Runnable {
    public final int f57999a;
    public final t f58000b;

    public o(t tVar, int i7) {
        this.f57999a = i7;
        this.f58000b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f57999a) {
            case 0:
                t tVar = this.f58000b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f58000b.c();
                return;
        }
    }
}
