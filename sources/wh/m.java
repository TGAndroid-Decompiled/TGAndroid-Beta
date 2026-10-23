package wh;
public final class m implements Runnable {
    public final int f49543a;
    public final n f49544b;
    public final int f49545c;

    public m(n nVar, int i10, int i11) {
        this.f49543a = i11;
        this.f49544b = nVar;
        this.f49545c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49543a) {
            case 0:
                n nVar = this.f49544b;
                nVar.post(new m(nVar, this.f49545c, 1));
                return;
            default:
                int i10 = this.f49545c;
                n nVar2 = this.f49544b;
                if (i10 == nVar2.h) {
                    nVar2.f49549f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
