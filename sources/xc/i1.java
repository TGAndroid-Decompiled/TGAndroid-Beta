package xc;
public enum i1 extends a2 {
    public i1() {
        super("AfterDoctypePublicKeyword", 54);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f53653m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f53598a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f53646c = a2.C0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f53646c = vVar;
                        return;
                    }
                    kVar.m(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f53646c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f53646c = a2.f53624u0;
                return;
            }
            kVar.m(this);
            kVar.f53646c = a2.f53623t0;
            return;
        }
        kVar.f53646c = a2.f53622s0;
    }
}
