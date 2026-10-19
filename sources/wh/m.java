package wh;
public final class m implements Runnable {
    public final int f49092a;
    public final n f49093b;
    public final int f49094c;

    public m(n nVar, int i10, int i11) {
        this.f49092a = i11;
        this.f49093b = nVar;
        this.f49094c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49092a) {
            case 0:
                n nVar = this.f49093b;
                nVar.post(new m(nVar, this.f49094c, 1));
                return;
            default:
                int i10 = this.f49094c;
                n nVar2 = this.f49093b;
                if (i10 == nVar2.h) {
                    nVar2.f49098f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
