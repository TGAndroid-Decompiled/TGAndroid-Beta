package uh;
public final class n implements Runnable {
    public final int f42817a;
    public final o f42818b;

    public n(o oVar, int i10) {
        this.f42817a = i10;
        this.f42818b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f42817a) {
            case 0:
                o oVar = this.f42818b;
                oVar.post(new n(oVar, 1));
                return;
            default:
                o oVar2 = this.f42818b;
                oVar2.d = true;
                oVar2.b();
                return;
        }
    }
}
