package pc;
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f41205n;
        char d = aVar.d();
        z0 z0Var = a2.f41160g0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f41150a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f41186c.append(d);
                        kVar.f41197c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f41197c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f41197c = vVar;
                return;
            }
            kVar.f41197c = a2.f41159f0;
            return;
        }
        kVar.m(this);
        eVar.f41186c.append((char) 65533);
        kVar.f41197c = z0Var;
    }
}
