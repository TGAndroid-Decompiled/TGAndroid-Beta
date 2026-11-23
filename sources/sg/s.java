package sg;
public final class s implements Runnable {
    public final int f57345a;
    public final v f57346b;

    public s(v vVar, int i7) {
        this.f57345a = i7;
        this.f57346b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57345a) {
            case 0:
                v vVar = this.f57346b;
                h hVar = vVar.A;
                if (hVar != null) {
                    vVar.f57377a.g(hVar);
                    vVar.A = null;
                    return;
                }
                return;
            default:
                this.f57346b.a(null, true, null);
                return;
        }
    }
}
