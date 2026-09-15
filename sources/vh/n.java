package vh;
public final class n implements Runnable {
    public final int f44449a;
    public final o f44450b;

    public n(o oVar, int i10) {
        this.f44449a = i10;
        this.f44450b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f44449a) {
            case 0:
                o oVar = this.f44450b;
                oVar.post(new n(oVar, 1));
                return;
            default:
                o oVar2 = this.f44450b;
                oVar2.d = true;
                oVar2.b();
                return;
        }
    }
}
