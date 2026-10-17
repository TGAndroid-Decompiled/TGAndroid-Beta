package wh;
public final class m implements Runnable {
    public final int f49113a;
    public final n f49114b;
    public final int f49115c;

    public m(n nVar, int i10, int i11) {
        this.f49113a = i11;
        this.f49114b = nVar;
        this.f49115c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49113a) {
            case 0:
                n nVar = this.f49114b;
                nVar.post(new m(nVar, this.f49115c, 1));
                return;
            default:
                int i10 = this.f49115c;
                n nVar2 = this.f49114b;
                if (i10 == nVar2.h) {
                    nVar2.f49119f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
