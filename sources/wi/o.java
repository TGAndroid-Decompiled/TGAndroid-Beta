package wi;
public final class o implements Runnable {
    public final int f58024a;
    public final t f58025b;

    public o(t tVar, int i7) {
        this.f58024a = i7;
        this.f58025b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f58024a) {
            case 0:
                t tVar = this.f58025b;
                if (tVar.W != 0) {
                    tVar.V = true;
                    return;
                }
                return;
            default:
                this.f58025b.c();
                return;
        }
    }
}
