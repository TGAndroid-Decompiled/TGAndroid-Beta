package sg;
public final class s implements Runnable {
    public final int f56761a;
    public final v f56762b;

    public s(v vVar, int i7) {
        this.f56761a = i7;
        this.f56762b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f56761a) {
            case 0:
                v vVar = this.f56762b;
                h hVar = vVar.A;
                if (hVar != null) {
                    vVar.f56793a.g(hVar);
                    vVar.A = null;
                    return;
                }
                return;
            default:
                this.f56762b.a(null, true, null);
                return;
        }
    }
}
