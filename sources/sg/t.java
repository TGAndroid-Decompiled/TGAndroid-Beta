package sg;
public final class t implements Runnable {
    public final int f57358a;
    public final v f57359b;
    public final j0 f57360c;

    public t(v vVar, j0 j0Var, int i7) {
        this.f57358a = i7;
        this.f57359b = vVar;
        this.f57360c = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f57358a) {
            case 0:
                org.telegram.messenger.g0.g3(new t(this.f57359b, this.f57360c, 1));
                return;
            default:
                v vVar = this.f57359b;
                vVar.getClass();
                vVar.f57383i = this.f57360c.f57258a;
                return;
        }
    }
}
