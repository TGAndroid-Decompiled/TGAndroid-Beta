package qi;
public final class k implements Runnable {
    public final int f56314a;
    public final p f56315b;

    public k(p pVar, int i7) {
        this.f56314a = i7;
        this.f56315b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f56314a) {
            case 0:
                a aVar = this.f56315b.f56330w;
                if (aVar != null) {
                    aVar.close();
                    return;
                }
                return;
            default:
                this.f56315b.a();
                return;
        }
    }
}
