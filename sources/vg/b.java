package vg;
public final class b implements Runnable {
    public final int f57261a;
    public final e f57262b;
    public final int f57263c;

    public b(e eVar, int i7, int i10) {
        this.f57261a = i10;
        this.f57262b = eVar;
        this.f57263c = i7;
    }

    @Override
    public final void run() {
        switch (this.f57261a) {
            case 0:
                e eVar = this.f57262b;
                eVar.postOnAnimation(new b(eVar, this.f57263c, 1));
                return;
            default:
                e eVar2 = this.f57262b;
                int i7 = this.f57263c;
                if (eVar2.f57273e && !eVar2.f57276r && i7 == eVar2.E) {
                    eVar2.f57280y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
