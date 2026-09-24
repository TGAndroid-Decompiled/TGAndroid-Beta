package vh;
public final class m implements Runnable {
    public final int f44715a;
    public final n f44716b;

    public m(n nVar, int i10) {
        this.f44715a = i10;
        this.f44716b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f44715a) {
            case 0:
                n nVar = this.f44716b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f44716b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
