package sg;
public final class t implements Runnable {
    public final int f57393a;
    public final v f57394b;
    public final j0 f57395c;

    public t(v vVar, j0 j0Var, int i7) {
        this.f57393a = i7;
        this.f57394b = vVar;
        this.f57395c = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f57393a) {
            case 0:
                org.telegram.messenger.g0.g3(new t(this.f57394b, this.f57395c, 1));
                return;
            default:
                v vVar = this.f57394b;
                vVar.getClass();
                vVar.f57418i = this.f57395c.f57293a;
                return;
        }
    }
}
