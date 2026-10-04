package vh;
public final class m implements Runnable {
    public final int f48429a;
    public final n f48430b;

    public m(n nVar, int i10) {
        this.f48429a = i10;
        this.f48430b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f48429a) {
            case 0:
                n nVar = this.f48430b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f48430b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
