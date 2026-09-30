package vh;
public final class m implements Runnable {
    public final int f44731a;
    public final n f44732b;

    public m(n nVar, int i10) {
        this.f44731a = i10;
        this.f44732b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f44731a) {
            case 0:
                n nVar = this.f44732b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f44732b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
