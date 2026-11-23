package qi;
public final class k implements Runnable {
    public final int f56201a;
    public final p f56202b;

    public k(p pVar, int i7) {
        this.f56201a = i7;
        this.f56202b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f56201a) {
            case 0:
                a aVar = this.f56202b.f56217w;
                if (aVar != null) {
                    aVar.close();
                    return;
                }
                return;
            default:
                this.f56202b.a();
                return;
        }
    }
}
