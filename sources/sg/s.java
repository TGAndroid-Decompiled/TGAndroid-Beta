package sg;
public final class s implements Runnable {
    public final int f55197a;
    public final w f55198b;

    public s(w wVar, int i7) {
        this.f55197a = i7;
        this.f55198b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f55197a) {
            case 0:
                w wVar = this.f55198b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.f55225a.g(hVar);
                    wVar.A = null;
                    return;
                }
                return;
            default:
                this.f55198b.a(null, true, null);
                return;
        }
    }
}
