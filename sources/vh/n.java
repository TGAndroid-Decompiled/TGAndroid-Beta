package vh;
public final class n implements Runnable {
    public final int f44445a;
    public final o f44446b;

    public n(o oVar, int i10) {
        this.f44445a = i10;
        this.f44446b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f44445a) {
            case 0:
                o oVar = this.f44446b;
                oVar.post(new n(oVar, 1));
                return;
            default:
                o oVar2 = this.f44446b;
                oVar2.d = true;
                oVar2.b();
                return;
        }
    }
}
