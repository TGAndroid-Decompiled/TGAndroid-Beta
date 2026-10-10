package vh;
public final class m implements Runnable {
    public final int f49771a;
    public final n f49772b;
    public final int f49773c;

    public m(n nVar, int i10, int i11) {
        this.f49771a = i11;
        this.f49772b = nVar;
        this.f49773c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49771a) {
            case 0:
                n nVar = this.f49772b;
                nVar.post(new m(nVar, this.f49773c, 1));
                return;
            default:
                int i10 = this.f49773c;
                n nVar2 = this.f49772b;
                if (i10 == nVar2.h) {
                    nVar2.f49778f = false;
                    nVar2.d = true;
                    nVar2.b();
                    return;
                }
                return;
        }
    }
}
