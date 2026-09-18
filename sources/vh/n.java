package vh;
public final class n implements Runnable {
    public final int f44702a;
    public final o f44703b;

    public n(o oVar, int i10) {
        this.f44702a = i10;
        this.f44703b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f44702a) {
            case 0:
                o oVar = this.f44703b;
                oVar.post(new n(oVar, 1));
                return;
            default:
                o oVar2 = this.f44703b;
                oVar2.d = true;
                oVar2.b();
                return;
        }
    }
}
