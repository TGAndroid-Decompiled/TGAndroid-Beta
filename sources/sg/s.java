package sg;
public final class s implements Runnable {
    public final int f55106a;
    public final w f55107b;

    public s(w wVar, int i7) {
        this.f55106a = i7;
        this.f55107b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f55106a) {
            case 0:
                w wVar = this.f55107b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.f55134a.g(hVar);
                    wVar.A = null;
                    return;
                }
                return;
            default:
                this.f55107b.a(null, true, null);
                return;
        }
    }
}
