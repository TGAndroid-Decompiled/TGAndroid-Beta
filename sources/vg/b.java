package vg;
public final class b implements Runnable {
    public final int f59405a;
    public final e f59406b;
    public final int f59407c;

    public b(e eVar, int i7, int i10) {
        this.f59405a = i10;
        this.f59406b = eVar;
        this.f59407c = i7;
    }

    @Override
    public final void run() {
        switch (this.f59405a) {
            case 0:
                e eVar = this.f59406b;
                eVar.postOnAnimation(new b(eVar, this.f59407c, 1));
                return;
            default:
                e eVar2 = this.f59406b;
                int i7 = this.f59407c;
                if (eVar2.f59417e && !eVar2.f59420r && i7 == eVar2.F) {
                    eVar2.f59424y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
