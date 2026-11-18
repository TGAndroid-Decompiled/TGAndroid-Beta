package vg;
public final class b implements Runnable {
    public final int f59404a;
    public final e f59405b;
    public final int f59406c;

    public b(e eVar, int i7, int i10) {
        this.f59404a = i10;
        this.f59405b = eVar;
        this.f59406c = i7;
    }

    @Override
    public final void run() {
        switch (this.f59404a) {
            case 0:
                e eVar = this.f59405b;
                eVar.postOnAnimation(new b(eVar, this.f59406c, 1));
                return;
            default:
                e eVar2 = this.f59405b;
                int i7 = this.f59406c;
                if (eVar2.f59416e && !eVar2.f59419r && i7 == eVar2.F) {
                    eVar2.f59423y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
