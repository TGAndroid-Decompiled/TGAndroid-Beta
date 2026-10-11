package vh;
public final class m implements Runnable {
    public final int f49848a;
    public final n f49849b;
    public final int f49850c;

    public m(n nVar, int i10, int i11) {
        this.f49848a = i11;
        this.f49849b = nVar;
        this.f49850c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49848a) {
            case 0:
                n nVar = this.f49849b;
                nVar.post(new m(nVar, this.f49850c, 1));
                return;
            default:
                int i10 = this.f49850c;
                n nVar2 = this.f49849b;
                if (i10 == nVar2.h) {
                    nVar2.f49855f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
