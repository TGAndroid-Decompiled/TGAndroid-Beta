package qh;
public final class p8 implements Runnable {
    public final int f45883a;
    public final ca f45884b;
    public final boolean f45885c;

    public p8(ca caVar, boolean z4, int i10) {
        this.f45883a = i10;
        this.f45884b = caVar;
        this.f45885c = z4;
    }

    @Override
    public final void run() {
        switch (this.f45883a) {
            case 0:
                this.f45884b.f(this.f45885c);
                return;
            case 1:
                ca caVar = this.f45884b;
                if (!this.f45885c) {
                    caVar.G0.b(false, false);
                    return;
                } else {
                    caVar.getClass();
                    return;
                }
            default:
                ca caVar2 = this.f45884b;
                caVar2.O = null;
                caVar2.f45088e = false;
                caVar2.q(this.f45885c);
                return;
        }
    }
}
