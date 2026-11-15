package vg;
public final class b implements Runnable {
    public final int f58835a;
    public final e f58836b;
    public final int f58837c;

    public b(e eVar, int i7, int i10) {
        this.f58835a = i10;
        this.f58836b = eVar;
        this.f58837c = i7;
    }

    @Override
    public final void run() {
        switch (this.f58835a) {
            case 0:
                e eVar = this.f58836b;
                eVar.postOnAnimation(new b(eVar, this.f58837c, 1));
                return;
            default:
                e eVar2 = this.f58836b;
                int i7 = this.f58837c;
                if (eVar2.f58847e && !eVar2.f58850r && i7 == eVar2.F) {
                    eVar2.f58854y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
