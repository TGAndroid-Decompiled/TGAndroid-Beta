package sg;
public final class s implements Runnable {
    public final int f57335a;
    public final v f57336b;

    public s(v vVar, int i7) {
        this.f57335a = i7;
        this.f57336b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57335a) {
            case 0:
                v vVar = this.f57336b;
                h hVar = vVar.A;
                if (hVar != null) {
                    vVar.f57367a.g(hVar);
                    vVar.A = null;
                    return;
                }
                return;
            default:
                this.f57336b.a(null, true, null);
                return;
        }
    }
}
