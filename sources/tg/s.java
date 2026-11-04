package tg;
public final class s implements Runnable {
    public final int f55302a;
    public final w f55303b;

    public s(w wVar, int i3) {
        this.f55302a = i3;
        this.f55303b = wVar;
    }

    @Override
    public final void run() {
        switch (this.f55302a) {
            case 0:
                w wVar = this.f55303b;
                h hVar = wVar.A;
                if (hVar != null) {
                    wVar.f55339a.g(hVar);
                    wVar.A = null;
                    return;
                }
                return;
            default:
                this.f55303b.a(null, true, null);
                return;
        }
    }
}
