package sg;
public final class s implements Runnable {
    public final int f55198a;
    public final w f55199b;

    public s(w wVar, int i7) {
        this.f55198a = i7;
        this.f55199b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f55198a) {
            case 0:
                w wVar = this.f55199b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.f55226a.g(hVar);
                    wVar.A = null;
                    return;
                }
                return;
            default:
                this.f55199b.a(null, true, null);
                return;
        }
    }
}
