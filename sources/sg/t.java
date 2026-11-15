package sg;
public final class t implements Runnable {
    public final int f56774a;
    public final v f56775b;
    public final j0 f56776c;

    public t(v vVar, j0 j0Var, int i7) {
        this.f56774a = i7;
        this.f56775b = vVar;
        this.f56776c = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f56774a) {
            case 0:
                org.telegram.messenger.g0.h3(new t(this.f56775b, this.f56776c, 1));
                return;
            default:
                v vVar = this.f56775b;
                vVar.getClass();
                vVar.f56799i = this.f56776c.f56674a;
                return;
        }
    }
}
