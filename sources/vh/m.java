package vh;
public final class m implements Runnable {
    public final int f49725a;
    public final n f49726b;
    public final int f49727c;

    public m(n nVar, int i10, int i11) {
        this.f49725a = i11;
        this.f49726b = nVar;
        this.f49727c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49725a) {
            case 0:
                n nVar = this.f49726b;
                nVar.post(new m(nVar, this.f49727c, 1));
                return;
            default:
                int i10 = this.f49727c;
                n nVar2 = this.f49726b;
                if (i10 == nVar2.h) {
                    nVar2.f49732f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
