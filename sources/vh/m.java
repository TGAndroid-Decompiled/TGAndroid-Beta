package vh;
public final class m implements Runnable {
    public final int f44775a;
    public final n f44776b;

    public m(n nVar, int i10) {
        this.f44775a = i10;
        this.f44776b = nVar;
    }

    @Override
    public final void run() {
        switch (this.f44775a) {
            case 0:
                n nVar = this.f44776b;
                nVar.post(new m(nVar, 1));
                return;
            default:
                n nVar2 = this.f44776b;
                nVar2.d = true;
                nVar2.b();
                return;
        }
    }
}
