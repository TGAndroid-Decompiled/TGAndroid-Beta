package xh;
public final class m implements Runnable {
    public final int f51963a;
    public final n f51964b;
    public final int f51965c;

    public m(n nVar, int i10, int i11) {
        this.f51963a = i11;
        this.f51964b = nVar;
        this.f51965c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51963a) {
            case 0:
                n nVar = this.f51964b;
                nVar.post(new m(nVar, this.f51965c, 1));
                return;
            default:
                int i10 = this.f51965c;
                n nVar2 = this.f51964b;
                if (i10 == nVar2.h) {
                    nVar2.f51969f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
