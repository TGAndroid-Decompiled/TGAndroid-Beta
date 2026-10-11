package vh;
public final class m implements Runnable {
    public final int f49814a;
    public final n f49815b;
    public final int f49816c;

    public m(n nVar, int i10, int i11) {
        this.f49814a = i11;
        this.f49815b = nVar;
        this.f49816c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49814a) {
            case 0:
                n nVar = this.f49815b;
                nVar.post(new m(nVar, this.f49816c, 1));
                return;
            default:
                int i10 = this.f49816c;
                n nVar2 = this.f49815b;
                if (i10 == nVar2.h) {
                    nVar2.f49821f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
