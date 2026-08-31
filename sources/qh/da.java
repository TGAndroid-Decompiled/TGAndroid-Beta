package qh;
public final class da implements Runnable {
    public final int f45233a;
    public final ma f45234b;

    public da(ma maVar, int i10) {
        this.f45233a = i10;
        this.f45234b = maVar;
    }

    @Override
    public final void run() {
        switch (this.f45233a) {
            case 0:
                ma maVar = this.f45234b;
                ka kaVar = maVar.J;
                if (kaVar != null) {
                    long j10 = kaVar.f45606a;
                    if (j10 > 0) {
                        maVar.E = j10;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ga gaVar = this.f45234b.f45687a;
                if (gaVar != null) {
                    gaVar.w0();
                    return;
                }
                return;
            default:
                ga gaVar2 = this.f45234b.f45687a;
                if (gaVar2 != null) {
                    gaVar2.G();
                    return;
                }
                return;
        }
    }
}
