package xh;
public final class m implements Runnable {
    public final int f51902a;
    public final n f51903b;
    public final int f51904c;

    public m(n nVar, int i10, int i11) {
        this.f51902a = i11;
        this.f51903b = nVar;
        this.f51904c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51902a) {
            case 0:
                n nVar = this.f51903b;
                nVar.post(new m(nVar, this.f51904c, 1));
                return;
            default:
                int i10 = this.f51904c;
                n nVar2 = this.f51903b;
                if (i10 == nVar2.h) {
                    nVar2.f51908f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
