package vh;
public final class m implements Runnable {
    public final int f44730a;
    public final n f44731b;

    public m(n nVar, int i10) {
        this.f44730a = i10;
        this.f44731b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f44730a) {
            case 0:
                n nVar = this.f44731b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f44731b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
