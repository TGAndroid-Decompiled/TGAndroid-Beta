package wh;
public final class m implements Runnable {
    public final int f49542a;
    public final n f49543b;
    public final int f49544c;

    public m(n nVar, int i10, int i11) {
        this.f49542a = i11;
        this.f49543b = nVar;
        this.f49544c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49542a) {
            case 0:
                n nVar = this.f49543b;
                nVar.post(new m(nVar, this.f49544c, 1));
                return;
            default:
                int i10 = this.f49544c;
                n nVar2 = this.f49543b;
                if (i10 == nVar2.h) {
                    nVar2.f49548f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
