package wh;
public final class m implements Runnable {
    public final int f47704a;
    public final n f47705b;
    public final int f47706c;

    public m(n nVar, int i10, int i11) {
        this.f47704a = i11;
        this.f47705b = nVar;
        this.f47706c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47704a) {
            case 0:
                n nVar = this.f47705b;
                nVar.post(new m(nVar, this.f47706c, 1));
                return;
            default:
                int i10 = this.f47706c;
                n nVar2 = this.f47705b;
                if (i10 == nVar2.h) {
                    nVar2.f47710f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
