package vg;
public final class b implements Runnable {
    public final int f57353a;
    public final e f57354b;
    public final int f57355c;

    public b(e eVar, int i7, int i10) {
        this.f57353a = i10;
        this.f57354b = eVar;
        this.f57355c = i7;
    }

    @Override
    public final void run() {
        switch (this.f57353a) {
            case 0:
                e eVar = this.f57354b;
                eVar.postOnAnimation(new b(eVar, this.f57355c, 1));
                return;
            default:
                e eVar2 = this.f57354b;
                int i7 = this.f57355c;
                if (eVar2.f57365e && !eVar2.f57368r && i7 == eVar2.E) {
                    eVar2.f57372y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
