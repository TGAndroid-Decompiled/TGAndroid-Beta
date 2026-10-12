package wh;
public final class m implements Runnable {
    public final int f47705a;
    public final n f47706b;
    public final int f47707c;

    public m(n nVar, int i10, int i11) {
        this.f47705a = i11;
        this.f47706b = nVar;
        this.f47707c = i10;
    }

    @Override
    public final void run() {
        switch (this.f47705a) {
            case 0:
                n nVar = this.f47706b;
                nVar.post(new m(nVar, this.f47707c, 1));
                return;
            default:
                int i10 = this.f47707c;
                n nVar2 = this.f47706b;
                if (i10 == nVar2.h) {
                    nVar2.f47711f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
