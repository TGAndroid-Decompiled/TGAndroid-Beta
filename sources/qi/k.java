package qi;
public final class k implements Runnable {
    public final int f56236a;
    public final p f56237b;

    public k(p pVar, int i7) {
        this.f56236a = i7;
        this.f56237b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f56236a) {
            case 0:
                a aVar = this.f56237b.f56252w;
                if (aVar != null) {
                    aVar.close();
                    return;
                }
                return;
            default:
                this.f56237b.a();
                return;
        }
    }
}
