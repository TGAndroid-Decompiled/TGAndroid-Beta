package vh;
public final class m implements Runnable {
    public final int f49727a;
    public final n f49728b;
    public final int f49729c;

    public m(n nVar, int i10, int i11) {
        this.f49727a = i11;
        this.f49728b = nVar;
        this.f49729c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49727a) {
            case 0:
                n nVar = this.f49728b;
                nVar.post(new m(nVar, this.f49729c, 1));
                return;
            default:
                int i10 = this.f49729c;
                n nVar2 = this.f49728b;
                if (i10 == nVar2.h) {
                    nVar2.f49734f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
