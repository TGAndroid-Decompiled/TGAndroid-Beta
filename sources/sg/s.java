package sg;
public final class s implements Runnable {
    public final int f57380a;
    public final v f57381b;

    public s(v vVar, int i7) {
        this.f57380a = i7;
        this.f57381b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f57380a) {
            case 0:
                v vVar = this.f57381b;
                h hVar = vVar.A;
                if (hVar != null) {
                    vVar.f57412a.g(hVar);
                    vVar.A = null;
                    return;
                }
                return;
            default:
                this.f57381b.a(null, true, null);
                return;
        }
    }
}
