package vh;
public final class n implements Runnable {
    public final int f44472a;
    public final o f44473b;

    public n(o oVar, int i10) {
        this.f44472a = i10;
        this.f44473b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f44472a) {
            case 0:
                o oVar = this.f44473b;
                oVar.post(new n(oVar, 1));
                return;
            default:
                o oVar2 = this.f44473b;
                oVar2.d = true;
                oVar2.b();
                return;
        }
    }
}
