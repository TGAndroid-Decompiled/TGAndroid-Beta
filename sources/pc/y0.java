package pc;
public enum y0 extends a2 {
    public y0() {
        super("CommentStartDash", 45);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f41182n;
        char d = aVar.d();
        z0 z0Var = a2.f41137g0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f41127a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f41163c.append(d);
                        kVar.f41174c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f41174c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.i();
                kVar.f41174c = vVar;
                return;
            }
            kVar.f41174c = a2.f41136f0;
            return;
        }
        kVar.m(this);
        eVar.f41163c.append((char) 65533);
        kVar.f41174c = z0Var;
    }
}
