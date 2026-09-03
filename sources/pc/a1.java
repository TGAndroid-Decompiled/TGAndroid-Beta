package pc;
public enum a1 extends a2 {
    public a1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f41205n;
        char d = aVar.d();
        z0 z0Var = a2.f41160g0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb = eVar.f41186c;
                    sb.append('-');
                    sb.append(d);
                    kVar.f41197c = z0Var;
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f41197c = a2.f41150a;
                return;
            }
            kVar.f41197c = a2.f41162i0;
            return;
        }
        kVar.m(this);
        StringBuilder sb2 = eVar.f41186c;
        sb2.append('-');
        sb2.append((char) 65533);
        kVar.f41197c = z0Var;
    }
}
