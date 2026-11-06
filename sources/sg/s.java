package sg;
public final class s implements Runnable {
    public final int f55105a;
    public final w f55106b;

    public s(w wVar, int i7) {
        this.f55105a = i7;
        this.f55106b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f55105a) {
            case 0:
                w wVar = this.f55106b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.f55133a.g(hVar);
                    wVar.A = null;
                    return;
                }
                return;
            default:
                this.f55106b.a(null, true, null);
                return;
        }
    }
}
