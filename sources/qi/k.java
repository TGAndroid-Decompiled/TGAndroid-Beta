package qi;
public final class k implements Runnable {
    public final int f56191a;
    public final p f56192b;

    public k(p pVar, int i7) {
        this.f56191a = i7;
        this.f56192b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f56191a) {
            case 0:
                a aVar = this.f56192b.f56207w;
                if (aVar != null) {
                    aVar.close();
                    return;
                }
                return;
            default:
                this.f56192b.a();
                return;
        }
    }
}
