package sg;
public final class s implements Runnable {
    public final int f55207a;
    public final w f55208b;

    public s(w wVar, int i7) {
        this.f55207a = i7;
        this.f55208b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f55207a) {
            case 0:
                w wVar = this.f55208b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.f55244a.g(hVar);
                    wVar.A = null;
                    return;
                }
                return;
            default:
                this.f55208b.a(null, true, null);
                return;
        }
    }
}
