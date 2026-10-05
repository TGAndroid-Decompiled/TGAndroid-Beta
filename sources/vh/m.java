package vh;
public final class m implements Runnable {
    public final int f48445a;
    public final n f48446b;

    public m(n nVar, int i10) {
        this.f48445a = i10;
        this.f48446b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f48445a) {
            case 0:
                n nVar = this.f48446b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f48446b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
