package u2;
public final class h0 implements e2.h {
    public final int f47282a;
    public final a5.a f47283b;
    public final t f47284c;
    public final b0 d;

    public h0(a5.a aVar, t tVar, b0 b0Var, int i10) {
        this.f47282a = i10;
        this.f47283b = aVar;
        this.f47284c = tVar;
        this.d = b0Var;
    }

    @Override
    public final void accept(Object obj) {
        k0 k0Var = (k0) obj;
        switch (this.f47282a) {
            case 0:
                a5.a aVar = this.f47283b;
                k0Var.e(aVar.f299b, (f0) aVar.f300c, this.f47284c, this.d);
                return;
            default:
                a5.a aVar2 = this.f47283b;
                k0Var.j(aVar2.f299b, (f0) aVar2.f300c, this.f47284c, this.d);
                return;
        }
    }
}
