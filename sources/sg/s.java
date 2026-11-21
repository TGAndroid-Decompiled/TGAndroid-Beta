package sg;
public final class s implements Runnable {
    public final int f57376a;
    public final v f57377b;

    public s(v vVar, int i7) {
        this.f57376a = i7;
        this.f57377b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57376a) {
            case 0:
                v vVar = this.f57377b;
                h hVar = vVar.A;
                if (hVar != null) {
                    vVar.f57408a.g(hVar);
                    vVar.A = null;
                    return;
                }
                return;
            default:
                this.f57377b.a(null, true, null);
                return;
        }
    }
}
