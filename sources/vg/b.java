package vg;
public final class b implements Runnable {
    public final int f57262a;
    public final e f57263b;
    public final int f57264c;

    public b(e eVar, int i7, int i10) {
        this.f57262a = i10;
        this.f57263b = eVar;
        this.f57264c = i7;
    }

    @Override
    public final void run() {
        switch (this.f57262a) {
            case 0:
                e eVar = this.f57263b;
                eVar.postOnAnimation(new b(eVar, this.f57264c, 1));
                return;
            default:
                e eVar2 = this.f57263b;
                int i7 = this.f57264c;
                if (eVar2.f57274e && !eVar2.f57277r && i7 == eVar2.E) {
                    eVar2.f57281y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
