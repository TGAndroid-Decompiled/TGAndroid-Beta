package wi;
public final class o implements Runnable {
    public final int f58023a;
    public final t f58024b;

    public o(t tVar, int i7) {
        this.f58023a = i7;
        this.f58024b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f58023a) {
            case 0:
                t tVar = this.f58024b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f58024b.c();
                return;
        }
    }
}
