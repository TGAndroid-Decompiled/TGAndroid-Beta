package vg;
public final class b implements Runnable {
    public final int f57237a;
    public final e f57238b;
    public final int f57239c;

    public b(e eVar, int i7, int i10) {
        this.f57237a = i10;
        this.f57238b = eVar;
        this.f57239c = i7;
    }

    @Override
    public final void run() {
        switch (this.f57237a) {
            case 0:
                e eVar = this.f57238b;
                eVar.postOnAnimation(new b(eVar, this.f57239c, 1));
                return;
            default:
                e eVar2 = this.f57238b;
                int i7 = this.f57239c;
                if (eVar2.f57249e && !eVar2.f57252r && i7 == eVar2.E) {
                    eVar2.f57256y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
