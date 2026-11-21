package vg;
public final class b implements Runnable {
    public final int f59443a;
    public final e f59444b;
    public final int f59445c;

    public b(e eVar, int i7, int i10) {
        this.f59443a = i10;
        this.f59444b = eVar;
        this.f59445c = i7;
    }

    @Override
    public final void run() {
        switch (this.f59443a) {
            case 0:
                e eVar = this.f59444b;
                eVar.postOnAnimation(new b(eVar, this.f59445c, 1));
                return;
            default:
                e eVar2 = this.f59444b;
                int i7 = this.f59445c;
                if (eVar2.f59455e && !eVar2.f59458r && i7 == eVar2.F) {
                    eVar2.f59462y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
