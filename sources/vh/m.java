package vh;
public final class m implements Runnable {
    public final int f49963a;
    public final n f49964b;
    public final int f49965c;

    public m(n nVar, int i10, int i11) {
        this.f49963a = i11;
        this.f49964b = nVar;
        this.f49965c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49963a) {
            case 0:
                n nVar = this.f49964b;
                nVar.post(new m(nVar, this.f49965c, 1));
                return;
            default:
                int i10 = this.f49965c;
                n nVar2 = this.f49964b;
                if (i10 == nVar2.h) {
                    nVar2.f49970f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
