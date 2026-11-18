package sg;
public final class t implements Runnable {
    public final int f57348a;
    public final v f57349b;
    public final j0 f57350c;

    public t(v vVar, j0 j0Var, int i7) {
        this.f57348a = i7;
        this.f57349b = vVar;
        this.f57350c = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f57348a) {
            case 0:
                org.telegram.messenger.g0.g3(new t(this.f57349b, this.f57350c, 1));
                return;
            default:
                v vVar = this.f57349b;
                vVar.getClass();
                vVar.f57373i = this.f57350c.f57248a;
                return;
        }
    }
}
