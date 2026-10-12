package vh;
public final class m implements Runnable {
    public final int f49955a;
    public final n f49956b;
    public final int f49957c;

    public m(n nVar, int i10, int i11) {
        this.f49955a = i11;
        this.f49956b = nVar;
        this.f49957c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49955a) {
            case 0:
                n nVar = this.f49956b;
                nVar.post(new m(nVar, this.f49957c, 1));
                return;
            default:
                int i10 = this.f49957c;
                n nVar2 = this.f49956b;
                if (i10 == nVar2.h) {
                    nVar2.f49962f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
