package vg;
public final class b implements Runnable {
    public final int f59532a;
    public final e f59533b;
    public final int f59534c;

    public b(e eVar, int i7, int i10) {
        this.f59532a = i10;
        this.f59533b = eVar;
        this.f59534c = i7;
    }

    @Override
    public final void run() {
        switch (this.f59532a) {
            case 0:
                e eVar = this.f59533b;
                eVar.postOnAnimation(new b(eVar, this.f59534c, 1));
                return;
            default:
                e eVar2 = this.f59533b;
                int i7 = this.f59534c;
                if (eVar2.f59544e && !eVar2.f59547r && i7 == eVar2.F) {
                    eVar2.f59551y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
