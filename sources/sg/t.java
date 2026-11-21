package sg;
public final class t implements Runnable {
    public final int f57389a;
    public final v f57390b;
    public final j0 f57391c;

    public t(v vVar, j0 j0Var, int i7) {
        this.f57389a = i7;
        this.f57390b = vVar;
        this.f57391c = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f57389a) {
            case 0:
                org.telegram.messenger.g0.g3(new t(this.f57390b, this.f57391c, 1));
                return;
            default:
                v vVar = this.f57390b;
                vVar.getClass();
                vVar.f57414i = this.f57391c.f57289a;
                return;
        }
    }
}
