package wh;
public final class m implements Runnable {
    public final int f49101a;
    public final n f49102b;
    public final int f49103c;

    public m(n nVar, int i10, int i11) {
        this.f49101a = i11;
        this.f49102b = nVar;
        this.f49103c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49101a) {
            case 0:
                n nVar = this.f49102b;
                nVar.post(new m(nVar, this.f49103c, 1));
                return;
            default:
                int i10 = this.f49103c;
                n nVar2 = this.f49102b;
                if (i10 == nVar2.h) {
                    nVar2.f49107f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
