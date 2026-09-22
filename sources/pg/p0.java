package pg;
public final class p0 implements Runnable {
    public final int f41246a;
    public final s0 f41247b;

    public p0(s0 s0Var, int i10) {
        this.f41246a = i10;
        this.f41247b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41246a) {
            case 0:
                s0 s0Var = this.f41247b;
                s0Var.f41272c = null;
                l.d dVar = s0Var.f41270a;
                if (dVar != null) {
                    dVar.V();
                    return;
                }
                return;
            default:
                this.f41247b.b();
                return;
        }
    }
}
