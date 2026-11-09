package sg;
public final class s implements Runnable {
    public final int f55208a;
    public final w f55209b;

    public s(w wVar, int i7) {
        this.f55208a = i7;
        this.f55209b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f55208a) {
            case 0:
                w wVar = this.f55209b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.f55245a.g(hVar);
                    wVar.A = null;
                    return;
                }
                return;
            default:
                this.f55209b.a(null, true, null);
                return;
        }
    }
}
