package wh;
public final class m implements Runnable {
    public final int f49138a;
    public final n f49139b;
    public final int f49140c;

    public m(n nVar, int i10, int i11) {
        this.f49138a = i11;
        this.f49139b = nVar;
        this.f49140c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49138a) {
            case 0:
                n nVar = this.f49139b;
                nVar.post(new m(nVar, this.f49140c, 1));
                return;
            default:
                int i10 = this.f49140c;
                n nVar2 = this.f49139b;
                if (i10 == nVar2.h) {
                    nVar2.f49144f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
