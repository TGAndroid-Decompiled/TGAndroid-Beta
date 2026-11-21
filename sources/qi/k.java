package qi;
public final class k implements Runnable {
    public final int f56232a;
    public final p f56233b;

    public k(p pVar, int i7) {
        this.f56232a = i7;
        this.f56233b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f56232a) {
            case 0:
                a aVar = this.f56233b.f56248w;
                if (aVar != null) {
                    aVar.close();
                    return;
                }
                return;
            default:
                this.f56233b.a();
                return;
        }
    }
}
