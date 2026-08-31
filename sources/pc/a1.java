package pc;
public enum a1 extends a2 {
    public a1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f44349n;
        char d = aVar.d();
        z0 z0Var = a2.f44301g0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb = eVar.f44327c;
                    sb.append('-');
                    sb.append(d);
                    kVar.f44340c = z0Var;
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f44340c = a2.f44290a;
                return;
            }
            kVar.f44340c = a2.f44303i0;
            return;
        }
        kVar.m(this);
        StringBuilder sb2 = eVar.f44327c;
        sb2.append('-');
        sb2.append((char) 65533);
        kVar.f44340c = z0Var;
    }
}
