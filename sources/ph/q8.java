package ph;
public final class q8 implements Runnable {
    public final int f42250a;
    public final da f42251b;
    public final boolean f42252c;

    public q8(da daVar, boolean z4, int i10) {
        this.f42250a = i10;
        this.f42251b = daVar;
        this.f42252c = z4;
    }

    @Override
    public final void run() {
        switch (this.f42250a) {
            case 0:
                this.f42251b.f(this.f42252c);
                return;
            case 1:
                da daVar = this.f42251b;
                if (!this.f42252c) {
                    daVar.G0.b(false, false);
                    return;
                } else {
                    daVar.getClass();
                    return;
                }
            default:
                da daVar2 = this.f42251b;
                daVar2.O = null;
                daVar2.e = false;
                daVar2.q(this.f42252c);
                return;
        }
    }
}
