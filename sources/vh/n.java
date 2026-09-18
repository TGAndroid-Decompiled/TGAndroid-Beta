package vh;
public final class n implements Runnable {
    public final int f44477a;
    public final o f44478b;

    public n(o oVar, int i10) {
        this.f44477a = i10;
        this.f44478b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f44477a) {
            case 0:
                o oVar = this.f44478b;
                oVar.post(new n(oVar, 1));
                return;
            default:
                o oVar2 = this.f44478b;
                oVar2.d = true;
                oVar2.b();
                return;
        }
    }
}
