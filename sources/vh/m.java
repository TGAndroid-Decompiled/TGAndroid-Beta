package vh;
public final class m implements Runnable {
    public final int f44728a;
    public final n f44729b;

    public m(n nVar, int i10) {
        this.f44728a = i10;
        this.f44729b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f44728a) {
            case 0:
                n nVar = this.f44729b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f44729b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
