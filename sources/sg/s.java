package sg;
public final class s implements Runnable {
    public final int f57464a;
    public final v f57465b;

    public s(v vVar, int i7) {
        this.f57464a = i7;
        this.f57465b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57464a) {
            case 0:
                v vVar = this.f57465b;
                h hVar = vVar.A;
                if (hVar != null) {
                    vVar.f57487a.g(hVar);
                    vVar.A = null;
                    return;
                }
                return;
            default:
                this.f57465b.a(null, true, null);
                return;
        }
    }
}
