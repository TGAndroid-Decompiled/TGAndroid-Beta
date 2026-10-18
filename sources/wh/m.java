package wh;
public final class m implements Runnable {
    public final int f49091a;
    public final n f49092b;
    public final int f49093c;

    public m(n nVar, int i10, int i11) {
        this.f49091a = i11;
        this.f49092b = nVar;
        this.f49093c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49091a) {
            case 0:
                n nVar = this.f49092b;
                nVar.post(new m(nVar, this.f49093c, 1));
                return;
            default:
                int i10 = this.f49093c;
                n nVar2 = this.f49092b;
                if (i10 == nVar2.h) {
                    nVar2.f49097f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
