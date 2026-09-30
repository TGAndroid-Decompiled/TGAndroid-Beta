package vh;
public final class m implements Runnable {
    public final int f44837a;
    public final n f44838b;

    public m(n nVar, int i10) {
        this.f44837a = i10;
        this.f44838b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f44837a) {
            case 0:
                n nVar = this.f44838b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f44838b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
