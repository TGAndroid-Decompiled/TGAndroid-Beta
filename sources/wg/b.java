package wg;
public final class b implements Runnable {
    public final int f57608a;
    public final e f57609b;
    public final int f57610c;

    public b(e eVar, int i3, int i10) {
        this.f57608a = i10;
        this.f57609b = eVar;
        this.f57610c = i3;
    }

    @Override
    public final void run() {
        switch (this.f57608a) {
            case 0:
                e eVar = this.f57609b;
                eVar.postOnAnimation(new b(eVar, this.f57610c, 1));
                return;
            default:
                e eVar2 = this.f57609b;
                int i3 = this.f57610c;
                if (eVar2.f57620e && !eVar2.f57623r && i3 == eVar2.F) {
                    eVar2.f57627y = true;
                    eVar2.requestRender();
                    return;
                }
                return;
        }
    }
}
