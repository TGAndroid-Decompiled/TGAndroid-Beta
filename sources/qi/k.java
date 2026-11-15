package qi;
public final class k implements Runnable {
    public final int f55617a;
    public final p f55618b;

    public k(p pVar, int i7) {
        this.f55617a = i7;
        this.f55618b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f55617a) {
            case 0:
                a aVar = this.f55618b.f55633w;
                if (aVar != null) {
                    aVar.close();
                    return;
                }
                return;
            default:
                this.f55618b.a();
                return;
        }
    }
}
