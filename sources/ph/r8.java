package ph;
public final class r8 implements Runnable {
    public final int f42254a;
    public final da f42255b;
    public final boolean f42256c;

    public r8(da daVar, boolean z4, int i10) {
        this.f42254a = i10;
        this.f42255b = daVar;
        this.f42256c = z4;
    }

    @Override
    public final void run() {
        switch (this.f42254a) {
            case 0:
                this.f42255b.f(this.f42256c);
                return;
            case 1:
                da daVar = this.f42255b;
                if (!this.f42256c) {
                    daVar.G0.b(false, false);
                    return;
                } else {
                    daVar.getClass();
                    return;
                }
            default:
                da daVar2 = this.f42255b;
                daVar2.O = null;
                daVar2.e = false;
                daVar2.q(this.f42256c);
                return;
        }
    }
}
