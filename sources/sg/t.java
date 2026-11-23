package sg;
public final class t implements Runnable {
    public final int f57466a;
    public final v f57467b;
    public final i0 f57468c;

    public t(v vVar, i0 i0Var, int i7) {
        this.f57466a = i7;
        this.f57467b = vVar;
        this.f57468c = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f57466a) {
            case 0:
                org.telegram.messenger.g0.g3(new t(this.f57467b, this.f57468c, 1));
                return;
            default:
                v vVar = this.f57467b;
                vVar.getClass();
                vVar.f57493i = this.f57468c.f57364a;
                return;
        }
    }
}
