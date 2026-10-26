package xh;
public final class m implements Runnable {
    public final int f51905a;
    public final n f51906b;
    public final int f51907c;

    public m(n nVar, int i10, int i11) {
        this.f51905a = i11;
        this.f51906b = nVar;
        this.f51907c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51905a) {
            case 0:
                n nVar = this.f51906b;
                nVar.post(new m(nVar, this.f51907c, 1));
                return;
            default:
                int i10 = this.f51907c;
                n nVar2 = this.f51906b;
                if (i10 == nVar2.h) {
                    nVar2.f51911f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
