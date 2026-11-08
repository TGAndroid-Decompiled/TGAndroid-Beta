package vg;
public final class b implements Runnable {
    public final int f57354a;
    public final e f57355b;
    public final int f57356c;

    public b(e eVar, int i7, int i10) {
        this.f57354a = i10;
        this.f57355b = eVar;
        this.f57356c = i7;
    }

    @Override
    public final void run() {
        switch (this.f57354a) {
            case 0:
                e eVar = this.f57355b;
                eVar.postOnAnimation(new b(eVar, this.f57356c, 1));
                return;
            default:
                e eVar2 = this.f57355b;
                int i7 = this.f57356c;
                if (eVar2.f57366e && !eVar2.f57369r && i7 == eVar2.E) {
                    eVar2.f57373y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
