package vh;
public final class n implements Runnable {
    public final int f44399a;
    public final o f44400b;

    public n(o oVar, int i10) {
        this.f44399a = i10;
        this.f44400b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f44399a) {
            case 0:
                o oVar = this.f44400b;
                oVar.post(new n(oVar, 1));
                return;
            default:
                o oVar2 = this.f44400b;
                oVar2.d = true;
                oVar2.b();
                return;
        }
    }
}
