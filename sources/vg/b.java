package vg;
public final class b implements Runnable {
    public final int f57366a;
    public final e f57367b;
    public final int f57368c;

    public b(e eVar, int i7, int i10) {
        this.f57366a = i10;
        this.f57367b = eVar;
        this.f57368c = i7;
    }

    @Override
    public final void run() {
        switch (this.f57366a) {
            case 0:
                e eVar = this.f57367b;
                eVar.postOnAnimation(new b(eVar, this.f57368c, 1));
                return;
            default:
                e eVar2 = this.f57367b;
                int i7 = this.f57368c;
                if (eVar2.f57378e && !eVar2.f57381r && i7 == eVar2.E) {
                    eVar2.f57385y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
