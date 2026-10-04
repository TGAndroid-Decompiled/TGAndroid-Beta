package vh;
public final class m implements Runnable {
    public final int f48438a;
    public final n f48439b;

    public m(n nVar, int i10) {
        this.f48438a = i10;
        this.f48439b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f48438a) {
            case 0:
                n nVar = this.f48439b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f48439b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
