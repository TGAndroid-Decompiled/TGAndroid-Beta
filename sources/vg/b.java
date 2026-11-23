package vg;
public final class b implements Runnable {
    public final int f59447a;
    public final e f59448b;
    public final int f59449c;

    public b(e eVar, int i7, int i10) {
        this.f59447a = i10;
        this.f59448b = eVar;
        this.f59449c = i7;
    }

    @Override
    public final void run() {
        switch (this.f59447a) {
            case 0:
                e eVar = this.f59448b;
                eVar.postOnAnimation(new b(eVar, this.f59449c, 1));
                return;
            default:
                e eVar2 = this.f59448b;
                int i7 = this.f59449c;
                if (eVar2.f59459e && !eVar2.f59462r && i7 == eVar2.F) {
                    eVar2.f59466y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
