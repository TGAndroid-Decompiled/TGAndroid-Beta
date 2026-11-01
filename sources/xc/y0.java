package xc;
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f53672n;
        char d = aVar.d();
        z0 z0Var = a2.f53629j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f53616a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f53652c.append(d);
                        kVar.f53664c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f53664c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f53664c = vVar;
                return;
            }
            kVar.f53664c = a2.f53628i0;
            return;
        }
        kVar.m(this);
        eVar.f53652c.append((char) 65533);
        kVar.f53664c = z0Var;
    }
}
