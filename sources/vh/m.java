package vh;
public final class m implements Runnable {
    public final int f48430a;
    public final n f48431b;

    public m(n nVar, int i10) {
        this.f48430a = i10;
        this.f48431b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f48430a) {
            case 0:
                n nVar = this.f48431b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f48431b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
