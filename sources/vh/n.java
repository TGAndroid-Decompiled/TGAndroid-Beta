package vh;
public final class n implements Runnable {
    public final int f44746a;
    public final o f44747b;

    public n(o oVar, int i10) {
        this.f44746a = i10;
        this.f44747b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f44746a) {
            case 0:
                o oVar = this.f44747b;
                oVar.post(new n(oVar, 1));
                return;
            default:
                o oVar2 = this.f44747b;
                oVar2.d = true;
                oVar2.b();
                return;
        }
    }
}
