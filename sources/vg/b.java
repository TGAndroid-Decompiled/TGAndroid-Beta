package vg;
public final class b implements Runnable {
    public final int f57362a;
    public final e f57363b;
    public final int f57364c;

    public b(e eVar, int i7, int i10) {
        this.f57362a = i10;
        this.f57363b = eVar;
        this.f57364c = i7;
    }

    @Override
    public final void run() {
        switch (this.f57362a) {
            case 0:
                e eVar = this.f57363b;
                eVar.postOnAnimation(new b(eVar, this.f57364c, 1));
                return;
            default:
                e eVar2 = this.f57363b;
                int i7 = this.f57364c;
                if (eVar2.f57374e && !eVar2.f57377r && i7 == eVar2.E) {
                    eVar2.f57381y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
