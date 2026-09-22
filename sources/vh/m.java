package vh;
public final class m implements Runnable {
    public final int f44767a;
    public final n f44768b;

    public m(n nVar, int i10) {
        this.f44767a = i10;
        this.f44768b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f44767a) {
            case 0:
                n nVar = this.f44768b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f44768b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
