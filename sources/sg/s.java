package sg;
public final class s implements Runnable {
    public final int f55081a;
    public final w f55082b;

    public s(w wVar, int i7) {
        this.f55081a = i7;
        this.f55082b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f55081a) {
            case 0:
                w wVar = this.f55082b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.f55109a.g(hVar);
                    wVar.A = null;
                    return;
                }
                return;
            default:
                this.f55082b.a(null, true, null);
                return;
        }
    }
}
