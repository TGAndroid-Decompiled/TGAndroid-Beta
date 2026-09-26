package vh;
public final class m implements Runnable {
    public final int f44729a;
    public final n f44730b;

    public m(n nVar, int i10) {
        this.f44729a = i10;
        this.f44730b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f44729a) {
            case 0:
                n nVar = this.f44730b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f44730b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
